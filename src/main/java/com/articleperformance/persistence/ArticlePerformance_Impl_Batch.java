package com.articleperformance.persistence;

import com.articleperformance.model.Articles;
import com.articleperformance.model.ArticlesComments;
import com.articleperformance.model.ArticlesOnly;
import com.articleperformance.model.ArticlesWithoutComment;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticlePerformance_Impl_Batch {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EntityManagerFactory emf;

    @Transactional
    public Articles article_Create(Articles articles) {
        entityManager.persist(articles);
        return articles;
    }

    @Transactional
    public void comments_CreateWithAricle(int aId, ArticlesComments comments) {
        entityManager.persist(comments);
        Articles articles = entityManager.find(Articles.class, aId);
        articles.getArticlesComments().add(comments);
        entityManager.merge(articles);
    }//comments_CreateWithAricle

    @Transactional
    public void addCommentsList_withArticleBatch(int aId, List<ArticlesComments> commentsList) {
        for (Iterator<ArticlesComments> iterator = commentsList.iterator(); iterator.hasNext();) {
            ArticlesComments articlesComment = iterator.next();
            entityManager.persist(articlesComment);
        }

        Articles articles = entityManager.find(Articles.class, aId);
        articles.setArticlesComments(commentsList);
        entityManager.merge(articles);
    }//comments_CreateWithAricle

    public void addCommentsList_withArticleMenualTransanction(int aId, List<ArticlesComments> commentsList) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        for (Iterator<ArticlesComments> iterator = commentsList.iterator(); iterator.hasNext();) {
            ArticlesComments articlesComment = iterator.next();
            em.persist(articlesComment);
        }
        Articles articles = em.find(Articles.class, aId);
        articles.setArticlesComments(commentsList);
        em.merge(articles);
        em.getTransaction().commit();
        em.clear();
        em.close();
    }//comments_CreateWithAricle

    public List<ArticlesOnly> read_specific_Articles_column_withEntity() {
        String nativeSql = "select `articleID`, `articleContent`, `articleDate`, `articleDownvote`, `articleSubject`, `articleType`, `articleUpvote` "
                + "from Articles LIMIT 10";

        return entityManager.createNativeQuery(nativeSql,ArticlesOnly.class).getResultList();
    }//public List<ArticlesOnly> read_specific_Articles_column_withEntity() {
    
    public Articles readOneArticle(int aID)
    {
       return entityManager.find(Articles.class, aID);
    }//public Articles readOneArticle()
}//class

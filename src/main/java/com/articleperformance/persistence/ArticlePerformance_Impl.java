package com.articleperformance.persistence;

import com.articleperformance.model.Articles;
import com.articleperformance.model.ArticlesComments;
import com.articleperformance.model.ArticlesWithoutComment;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ArticlePerformance_Impl implements ArticlePerformane_I
{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Articles article_Create(Articles articles) 
    {
      entityManager.persist(articles);
       
       return articles;
    }

    @Override
    public void comments_CreateWithAricle(int aId,ArticlesComments comments) 
    {
        entityManager.persist(comments);

        Articles articles = entityManager.find(Articles.class, aId);
        articles.getArticlesComments().add(comments);
        entityManager.merge(articles);
        
    }
    
    @Override
    public ArticlesComments comments_Read(int articlesCommentsId)
    {
        Object o = entityManager.find(ArticlesComments.class, articlesCommentsId);
        ArticlesComments articlesComments = (ArticlesComments) o;
        
        return articlesComments;
    }
    
    @Override
    public void comment_Update(ArticlesComments articlesComments)
    {
        entityManager.merge(articlesComments);
    }
    
    @Override
    public void article_Update(Articles articles)
    {
        entityManager.merge(articles);
    }
    
    @Override
    public void comment_Delete(int aId,int cId)
    {
        ArticlesComments articlesComments = (ArticlesComments) entityManager.find(ArticlesComments.class,cId);
        Articles articles = (Articles) entityManager.find(Articles.class,aId);
        articles.getArticlesComments().remove(articlesComments);
        entityManager.remove(articlesComments);
        entityManager.flush();
        System.out.println("Clearing...!");
        entityManager.clear();
    
    }

//    @Override
//    public List read_specific_Articles_column() 
//    {
//        
//        Query qry = entityManager.createQuery("select articleID from Articles");
//        
//        List list = qry.getResultList();
//                
//        return list;        
//    }
    
    @Override
    public List read_specific_Articles_column() 
    {
//        Query qry = entityManager.createQuery("select articleID from Articles");//wrong
        
        //working
//        Query qry = entityManager.createNativeQuery("select articleID,articleUpvote from Articles");
//        List<Object[]> list = qry.getResultList();
//        return list;        
        
//        shortcut
        return  entityManager.createNativeQuery("select articleID,articleUpvote from Articles").getResultList();
    }//read_specific_Articles_column

    @Override
    public void delete_Article(int articleID) 
    {
        Articles articles =(Articles) entityManager.find(Articles.class,articleID);
        entityManager.remove(articles);
    }
    
}//ArticlePerformance_Impl

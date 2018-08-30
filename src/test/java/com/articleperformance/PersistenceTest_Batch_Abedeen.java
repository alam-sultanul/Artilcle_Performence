package com.articleperformance;

import com.articleperformance.model.Articles;
import com.articleperformance.model.ArticlesComments;
import com.articleperformance.model.ArticlesOnly;
import com.articleperformance.persistence.ArticlePerformance_Impl_Batch;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistenceTest_Batch_Abedeen {

    @Autowired
    ArticlePerformance_Impl_Batch articlePerformance_Impl_Batch;

//    @Test
    public void test_article_Create() {
        Articles articles = new Articles("tree", 0, 0, "12-06-2018", "nice", "tice");
        articlePerformance_Impl_Batch.article_Create(articles);

    }

//    @Test
    public void comments_CreateWithAricle() {
        
        for (int i = 0; i < 10; i++) 
        {
            ArticlesComments articlesComments = new ArticlesComments(0, new Date().toString(), 0, 0, "lolo");
//            articlePerformance_Impl_Batch.comments_CreateWithAricle(19, articlesComments);
        }
    }//comments_CreateWithAricle
    
//    @Test
    public void createManyArticleWithManyCommentsBatchAutomatic()
    {
        for (int i = 0; i < 100; i++) 
        {
            Articles articles = new Articles("tree", 0, 0, new Date().toString(), "nice", "tice");
            Articles a = articlePerformance_Impl_Batch.article_Create(articles);
            int aID = a.getArticleID();
            
            List<ArticlesComments> articlesCommentsesList = new ArrayList<>();
            
            for (int j = 0; j < 1000; j++) 
            {
                ArticlesComments articlesComments = new ArticlesComments(0, new Date().toString(), 0, 0, "lolo");
                articlesCommentsesList.add(articlesComments);
            }//for (int j = 0; j < 1000; j++) 
            
            articlePerformance_Impl_Batch.addCommentsList_withArticleBatch(aID, articlesCommentsesList);
        }//for (int i = 0; i < 100; i++) 
    }//createManyArticle()
    
    
//    not working due to exception creating transaction not allwed in shared entity manager
    /**
     * solved :  need to create EntityManger factory to do transaction menually.
     */
//    @Test
    public void createManyArticleWithManyCommentsBatchMenual()
    {
        for (int i = 0; i < 100; i++) 
        {
            Articles articles = new Articles("tree", 0, 0, new Date().toString(), "nice", "tice");
            Articles a = articlePerformance_Impl_Batch.article_Create(articles);
            int aID = a.getArticleID();
            
            List<ArticlesComments> articlesCommentsesList = new ArrayList<>();
            
            for (int j = 0; j < 1000; j++) 
            {
                ArticlesComments articlesComments = new ArticlesComments(0, new Date().toString(), 0, 0, "lolo");
                articlesCommentsesList.add(articlesComments);
            }//for (int j = 0; j < 1000; j++) 
            
            articlePerformance_Impl_Batch.addCommentsList_withArticleMenualTransanction(aID, articlesCommentsesList);
        }//for (int i = 0; i < 100; i++) 
    }//createManyArticle()
    
//    @Test
    public void readingArticleWithOutComments()
    {
        for (Iterator<ArticlesOnly> iterator = articlePerformance_Impl_Batch.read_specific_Articles_column_withEntity().iterator(); iterator.hasNext();) {
            System.out.println(iterator.next().toString());
        }//for
    } //public void readingArticleWithOutComments()

    @Test 
    public void test_readOneArticle()
    {
        System.out.println(articlePerformance_Impl_Batch.readOneArticle(1004).toString());
        
    }
    
}//class

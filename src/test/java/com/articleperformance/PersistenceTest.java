package com.articleperformance;

import com.articleperformance.model.Articles;
import com.articleperformance.model.ArticlesComments;
import com.articleperformance.persistence.ArticlePerformane_I;
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
public class PersistenceTest {

    @Autowired
    ArticlePerformane_I articlePerformane_I;

    @Test
    public void test_article_Create() {
//        String string_500 = "if u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Articles\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleIDif u want delete one article : \n"
//                + "localhost:8080/articlePerformance/url/delete_Article\n"
//                + "set param : articleID";
        Articles articles = new Articles("faka", 0, 0, "12-06-2018", "kaka", "caka");
        articlePerformane_I.article_Create(articles);
    }

//    @Test
    public void test_comments_CreateWithAricle() {

        for (int i = 0; i < 10; i++) {
            ArticlesComments articlesComments = new ArticlesComments(0, new Date().toString(), 0, 0, "lolo");
//            articlePerformane_I.comments_CreateWithAricle(19, articlesComments);
        }
    }//comments_CreateWithAricle

    /**
     *
     */
//    @Test
    public void test_createManyArticleWithManyComments() {
        for (int i = 0; i < 100; i++) {
            Articles articles = new Articles("tree", 0, 0, new Date().toString(), "nice", "tice");
            Articles a = articlePerformane_I.article_Create(articles);
            int aID = a.getArticleID();
            for (int j = 0; j < 1000; j++) {
                ArticlesComments articlesComments = new ArticlesComments(0, new Date().toString(), 0, 0, "lolo");
                articlePerformane_I.comments_CreateWithAricle(aID, articlesComments);
            }//for (int j = 0; j < 1000; j++) 
        }//for (int i = 0; i < 100; i++) 
    }//createManyArticleWithManyComments()

//    @Test
    public void test_article_Update() {
//        Articles articles = new Articles(1002, "skal", 4, 5, "12-09-2019", "articleContent", "articleType");
        Articles articles = new Articles(1002, "articleSubject", 5, 6, "01-02-2018", "articleContent", "articleType");
        articlePerformane_I.article_Update(articles);
    }

//    @Test
    public void test_comment_Delete() {
        articlePerformane_I.comment_Delete(1, 7);
    }

//    @Test
    public void read_specific_Articles_column() {
        List<Object[]> list = articlePerformane_I.read_specific_Articles_column();
        for (Iterator<Object[]> iterator = list.iterator(); iterator.hasNext();) {
            Object[] next = iterator.next();
            System.out.println(next[0] + "---" + next[1]);
        }//for
    }//public void read_specific_Articles_column() 

//    @Test
    public void test_delete_Article() {
        articlePerformane_I.delete_Article(2003);
    }

}//class

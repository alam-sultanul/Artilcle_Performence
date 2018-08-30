package com.articleperformance.controller;

import com.articleperformance.model.Articles;
import com.articleperformance.model.ArticlesComments;
import com.articleperformance.persistence.ArticlePerformance_Impl_Batch;
import com.articleperformance.persistence.ArticlePerformane_I;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/url")
public class Article_Controller 
{
    @Autowired
    private ArticlePerformane_I articlePerformane_I;
    
   
    @RequestMapping(value = "/articleCreate", method = RequestMethod.POST)
    public void articleCreate(@RequestBody Articles articles) 
    {
          articlePerformane_I.article_Create(articles);
    } 
    
    
    @RequestMapping(value = "/commentsCreateWithArticle", method = RequestMethod.POST)
    public void commentsCreateWithArticle(@RequestParam int aId,@RequestBody ArticlesComments articlesComments) 
    {
          articlePerformane_I.comments_CreateWithAricle(aId, articlesComments);
    } 
    
    @RequestMapping(value = "/comment_Update", method = RequestMethod.PUT)
    public void comment_Update(@RequestBody ArticlesComments articlesComments)
    {
        articlePerformane_I.comment_Update(articlesComments);
    }
    
    @RequestMapping(value = "/article_Update", method = RequestMethod.PUT)
    public void article_Update(@RequestBody Articles articles)
    {
        articlePerformane_I.article_Update(articles);
    }
    
    @RequestMapping(value = "/comment_Delete", method = RequestMethod.DELETE)
    public String comment_Delete(@RequestParam int aId,@RequestParam int cId)
    {
        articlePerformane_I.comment_Delete(aId, cId);
        
        return "delete sucessfully";
    }
    
    @RequestMapping(value = "/delete_Article", method = RequestMethod.DELETE)
     public String delete_Article(@RequestParam int articleID)
     {
         articlePerformane_I.delete_Article(articleID);
         
         return "delete sucessfully";
     }
     
    
}//class

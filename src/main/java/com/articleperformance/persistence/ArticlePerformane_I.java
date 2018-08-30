package com.articleperformance.persistence;

import com.articleperformance.model.Articles;
import com.articleperformance.model.ArticlesComments;
import java.util.List;

public interface ArticlePerformane_I
        
        
{
 public Articles article_Create(Articles articles);
 public void comments_CreateWithAricle(int aId,ArticlesComments comments);
 public void comment_Update(ArticlesComments articlesComments);
 public ArticlesComments comments_Read(int articlesCommentsId);
 public void article_Update(Articles articles);
 public void comment_Delete(int aId,int cId);
 public List read_specific_Articles_column();
 public void delete_Article(int articleID);
}
                                                            
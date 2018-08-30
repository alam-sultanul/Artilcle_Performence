package com.articleperformance.model;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Articles
    {

    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private int articleID;

    private String articleSubject;
    private int articleUpvote;
    private int articleDownvote;
    private String articleDate;
    
//     @Basic(optional = false)
    @Column(columnDefinition="clob")
    @Lob
    private String articleContent;
    private String articleType;
    
    @OneToMany( cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ArticlesComments> articlesComments;

    public Articles() 
    {
    }

    public Articles(int articleID, String articleSubject, int articleUpvote, int articleDownvote, String articleDate, String articleContent, String articleType, List<ArticlesComments> articlesComments) 
    {
        this.articleID = articleID;
        this.articleSubject = articleSubject;
        this.articleUpvote = articleUpvote;
        this.articleDownvote = articleDownvote;
        this.articleDate = articleDate;
        this.articleContent = articleContent;
        this.articleType = articleType;
        this.articlesComments = articlesComments;
    }
    public Articles(int articleID, String articleSubject, int articleUpvote, int articleDownvote, String articleDate, String articleContent, String articleType) 
    {
        this.articleID = articleID;
        this.articleSubject = articleSubject;
        this.articleUpvote = articleUpvote;
        this.articleDownvote = articleDownvote;
        this.articleDate = articleDate;
        this.articleContent = articleContent;
        this.articleType = articleType;
    }
    
    public Articles(String articleSubject, int articleUpvote, int articleDownvote, String articleDate, String articleContent, String articleType) 
    {
        
        this.articleSubject = articleSubject;
        this.articleUpvote = articleUpvote;
        this.articleDownvote = articleDownvote;
        this.articleDate = articleDate;
        this.articleContent = articleContent;
        this.articleType = articleType;
        
    }
    
    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public String getArticleSubject() {
        return articleSubject;
    }

    public void setArticleSubject(String articleSubject) {
        this.articleSubject = articleSubject;
    }

    public int getArticleUpvote() {
        return articleUpvote;
    }

    public void setArticleUpvote(int articleUpvote) {
        this.articleUpvote = articleUpvote;
    }

    public int getArticleDownvote() {
        return articleDownvote;
    }

    public void setArticleDownvote(int articleDownvote) {
        this.articleDownvote = articleDownvote;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public List<ArticlesComments> getArticlesComments() {
        return articlesComments;
    }

    public void setArticlesComments(List<ArticlesComments> articlesComments) {
        this.articlesComments = articlesComments;
    }
    
     @Override
    public String toString() {
        return "Articles{" + "articleID=" + articleID + ", articleSubject=" + articleSubject + ", articleUpvote=" + articleUpvote + ", articleDownvote=" + articleDownvote + ", articleDate=" + articleDate + ", articleContent=" + articleContent + ", articleType=" + articleType + ", articlesComments=" + articlesComments + '}';
    }
    
    }//class

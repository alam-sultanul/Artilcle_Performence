package com.articleperformance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArticlesComments
    {
    
    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private int commentId;
    private int userID;
    private String commentDate;
    private int commentUpVote;
    private int commentDownVote;
    private String commentContent;

    public ArticlesComments()
        {
        
        }

    public ArticlesComments(
            int commentId, 
            int userID, 
            String commentDate, 
            int commentUpVote, 
            int commentDownVote, 
            String commentContent   )
        {
        this.commentId = commentId;
        this.userID = userID;
        this.commentDate = commentDate;
        this.commentUpVote = commentUpVote;
        this.commentDownVote = commentDownVote;
        this.commentContent = commentContent;
        }
    public ArticlesComments(
            int userID, 
            String commentDate, 
            int commentUpVote, 
            int commentDownVote, 
            String commentContent   )
        {
        this.userID = userID;
        this.commentDate = commentDate;
        this.commentUpVote = commentUpVote;
        this.commentDownVote = commentDownVote;
        this.commentContent = commentContent;
        }
    
    
    public int getCommentId()
        {
        return commentId;
        }

    public void setCommentId(int commentId)
        {
        this.commentId = commentId;
        }
// 2  ***************************************************************  
    public int getUserID()
        {
        return userID;
        }

    public void setUserID(int userID)
        {
        this.userID = userID;
        }
    
// 3  ***************************************************************      
    public String getCommentDate()
        {
        return commentDate;
        }

    public void setCommentDate(String commentDate)
        {
        this.commentDate = commentDate;
        }
    
    public int getCommentUpVote()
        {
        return commentUpVote;
        }

    public void setCommentUpVote(int commentUpVote)
        {
        this.commentUpVote = commentUpVote;
        }

    public int getCommentDownVote()
        {
        return commentDownVote;
        }

    public void setCommentDownVote(int commentDownVote)
        {
        this.commentDownVote = commentDownVote;
        }

    public String getCommentContent()
        {
        return commentContent;
        }

    public void setCommentContent(String CommentContent)
        {
        this.commentContent = CommentContent;
        }



    }

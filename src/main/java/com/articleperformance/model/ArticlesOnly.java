/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.articleperformance.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell-3460
 */
@Entity
@Table(name = "articles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ArticlesOnly.findAll", query = "SELECT a FROM ArticlesOnly a")
    , @NamedQuery(name = "ArticlesOnly.findByArticleID", query = "SELECT a FROM ArticlesOnly a WHERE a.articleID = :articleID")
    , @NamedQuery(name = "ArticlesOnly.findByArticleContent", query = "SELECT a FROM ArticlesOnly a WHERE a.articleContent = :articleContent")
    , @NamedQuery(name = "ArticlesOnly.findByArticleDate", query = "SELECT a FROM ArticlesOnly a WHERE a.articleDate = :articleDate")
    , @NamedQuery(name = "ArticlesOnly.findByArticleDownvote", query = "SELECT a FROM ArticlesOnly a WHERE a.articleDownvote = :articleDownvote")
    , @NamedQuery(name = "ArticlesOnly.findByArticleSubject", query = "SELECT a FROM ArticlesOnly a WHERE a.articleSubject = :articleSubject")
    , @NamedQuery(name = "ArticlesOnly.findByArticleType", query = "SELECT a FROM ArticlesOnly a WHERE a.articleType = :articleType")
    , @NamedQuery(name = "ArticlesOnly.findByArticleUpvote", query = "SELECT a FROM ArticlesOnly a WHERE a.articleUpvote = :articleUpvote")})
public class ArticlesOnly implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "articleID")
    private Integer articleID;
    @Size(max = 255)
    @Column(name = "articleContent")
    private String articleContent;
    @Size(max = 255)
    @Column(name = "articleDate")
    private String articleDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "articleDownvote")
    private int articleDownvote;
    @Size(max = 255)
    @Column(name = "articleSubject")
    private String articleSubject;
    @Size(max = 255)
    @Column(name = "articleType")
    private String articleType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "articleUpvote")
    private int articleUpvote;

    public ArticlesOnly() {
    }

    public ArticlesOnly(Integer articleID) {
        this.articleID = articleID;
    }

    public ArticlesOnly(Integer articleID, int articleDownvote, int articleUpvote) {
        this.articleID = articleID;
        this.articleDownvote = articleDownvote;
        this.articleUpvote = articleUpvote;
    }

    public Integer getArticleID() {
        return articleID;
    }

    public void setArticleID(Integer articleID) {
        this.articleID = articleID;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public int getArticleDownvote() {
        return articleDownvote;
    }

    public void setArticleDownvote(int articleDownvote) {
        this.articleDownvote = articleDownvote;
    }

    public String getArticleSubject() {
        return articleSubject;
    }

    public void setArticleSubject(String articleSubject) {
        this.articleSubject = articleSubject;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public int getArticleUpvote() {
        return articleUpvote;
    }

    public void setArticleUpvote(int articleUpvote) {
        this.articleUpvote = articleUpvote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (articleID != null ? articleID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArticlesOnly)) {
            return false;
        }
        ArticlesOnly other = (ArticlesOnly) object;
        if ((this.articleID == null && other.articleID != null) || (this.articleID != null && !this.articleID.equals(other.articleID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ArticlesOnly{" + "articleID=" + articleID + ", articleContent=" + articleContent + ", articleDate=" + articleDate + ", articleDownvote=" + articleDownvote + ", articleSubject=" + articleSubject + ", articleType=" + articleType + ", articleUpvote=" + articleUpvote + '}';
    }

    
}//class

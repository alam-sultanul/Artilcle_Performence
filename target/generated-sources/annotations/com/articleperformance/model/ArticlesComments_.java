package com.articleperformance.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ArticlesComments.class)
public abstract class ArticlesComments_ {

	public static volatile SingularAttribute<ArticlesComments, Integer> commentDownVote;
	public static volatile SingularAttribute<ArticlesComments, String> commentDate;
	public static volatile SingularAttribute<ArticlesComments, Integer> commentId;
	public static volatile SingularAttribute<ArticlesComments, String> commentContent;
	public static volatile SingularAttribute<ArticlesComments, Integer> userID;
	public static volatile SingularAttribute<ArticlesComments, Integer> commentUpVote;

}


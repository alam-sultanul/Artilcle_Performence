package com.articleperformance.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Articles.class)
public abstract class Articles_ {

	public static volatile SingularAttribute<Articles, Integer> articleUpvote;
	public static volatile SingularAttribute<Articles, String> articleType;
	public static volatile SingularAttribute<Articles, Integer> articleID;
	public static volatile SingularAttribute<Articles, String> articleDate;
	public static volatile SingularAttribute<Articles, String> articleContent;
	public static volatile SingularAttribute<Articles, String> articleSubject;
	public static volatile SingularAttribute<Articles, Integer> articleDownvote;
	public static volatile ListAttribute<Articles, ArticlesComments> articlesComments;

}


package com.articleperformance.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ArticlesOnly.class)
public abstract class ArticlesOnly_ {

	public static volatile SingularAttribute<ArticlesOnly, Integer> articleUpvote;
	public static volatile SingularAttribute<ArticlesOnly, String> articleType;
	public static volatile SingularAttribute<ArticlesOnly, Integer> articleID;
	public static volatile SingularAttribute<ArticlesOnly, String> articleContent;
	public static volatile SingularAttribute<ArticlesOnly, String> articleDate;
	public static volatile SingularAttribute<ArticlesOnly, Integer> articleDownvote;
	public static volatile SingularAttribute<ArticlesOnly, String> articleSubject;

}


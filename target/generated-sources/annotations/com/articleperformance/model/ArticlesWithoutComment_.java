package com.articleperformance.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ArticlesWithoutComment.class)
public abstract class ArticlesWithoutComment_ {

	public static volatile SingularAttribute<ArticlesWithoutComment, Integer> articleUpvote;
	public static volatile SingularAttribute<ArticlesWithoutComment, String> articleType;
	public static volatile SingularAttribute<ArticlesWithoutComment, Integer> articleID;
	public static volatile SingularAttribute<ArticlesWithoutComment, String> articleDate;
	public static volatile SingularAttribute<ArticlesWithoutComment, String> articleContent;
	public static volatile SingularAttribute<ArticlesWithoutComment, String> articleSubject;
	public static volatile SingularAttribute<ArticlesWithoutComment, Integer> articleDownvote;

}


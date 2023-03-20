package com.example.javalaunchpad.dao.specs;

import com.example.javalaunchpad.dao.entity.Article;
import com.example.javalaunchpad.dao.entity.Article_;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;

public class ArticleSpecification {

    private Specification<Article> isPublished() {
        return (root, query, criteriaBuilder ) -> {
            Predicate predicate = criteriaBuilder.isTrue(root.get(Article_.published));
            return predicate;
        };
    }
    //Specification is a functional interface that  has only toPredicate() method with some default and static methods
    //we can combine a sets of Specification using and() or() .... it's also a specification
    //what is a Spec : Specification is just an atomic criteria ( instead of hardcoding a query like : select * from Articles where title like "%keyword%" we will define the criteria to find this articles and we will give it to JPA and it will only select the appropriate ZArticles i mean here to the findAll for example  )
    //so a spec it's a condition
    // we should write a different method for every spec (by implementing the toPredicate method )
    //  toPredicate method take as an arguments root , query and criteriaBuilder (we use criteriaBuilder to build our criteria our condition it return a predicate  )
    private Specification<Article> isArticleTitleLike(String searchKeyword) {
        return (root, query, criteriaBuilder ) -> {
            Predicate predicate = criteriaBuilder.like(root.get(Article_.TITLE) , "%"+searchKeyword+"%");
            return predicate;
        };
    }

}

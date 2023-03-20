package com.example.javalaunchpad.dao.repository;

import com.example.javalaunchpad.dao.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article , Long> {

}

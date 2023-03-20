package com.example.javalaunchpad.service;

import com.example.javalaunchpad.dao.entity.Article;
import com.example.javalaunchpad.dto.request.ArticleRequest;
import com.example.javalaunchpad.dto.response.ArticleResponse;
import com.example.javalaunchpad.exception.RessourceNotFoundException;

import java.util.List;

public interface ArticleService {

    // CRUD OPERATIONS
    Article saveArticle(Article article);
    void  deleteArticle(Long id) throws RessourceNotFoundException;
    Article updateArticle(Article article) throws RessourceNotFoundException;
    Article getArticleById(Long id ) throws RessourceNotFoundException;
    List<Article> getAllArticles();


}

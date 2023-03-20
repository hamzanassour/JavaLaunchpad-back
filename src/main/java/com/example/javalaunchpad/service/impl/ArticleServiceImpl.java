package com.example.javalaunchpad.service.impl;

import com.example.javalaunchpad.dao.entity.Article;
import com.example.javalaunchpad.dao.repository.ArticleRepository;
import com.example.javalaunchpad.exception.RessourceNotFoundException;
import com.example.javalaunchpad.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleServiceImpl   {
     // implements ArticleService

   // private ArticleRepository articleRepository ;

    //@Override
    //public Article saveArticle(Article article) {
      //  Article articleSaved = articleRepository.save(article);
        //return articleSaved ;
    //}

    //@Override
    //public void deleteArticle(Long id) throws RessourceNotFoundException {
      //  Article article = articleRepository.findById(id).orElseThrow(()->new RessourceNotFoundException("no Article with this id"));
        //articleRepository.delete(article);
    //  }

    // @Transactional
    //@Override
    //public Article updateArticle(Article article) throws RessourceNotFoundException {
        // we will keep things simple until it will be more complicated (update images .......... )
    // Article articleToBeUpdated = articleRepository.findById(article.getId()).orElseThrow(()->new RessourceNotFoundException("no Article with this id"));
        //If the Article object has many fields, you can consider using a mapping library such as MapStruct to map the input Article object to the existing Article object. This will make the code more concise and easier to read.
    // articleToBeUpdated.setBody(article.getBody());
    //  articleToBeUpdated.setTitle(article.getTitle());
    //  return articleToBeUpdated ;
    // }

    // @Override
    // public Article getArticleById(Long id) throws RessourceNotFoundException {
    //    Article article =articleRepository.findById(id).orElseThrow(()->new RessourceNotFoundException("no Article with this id"));
    //    return  article ;
    // }

    //  @Override
    // public List<Article> getAllArticles() {
//       return articles ;
    // }
}

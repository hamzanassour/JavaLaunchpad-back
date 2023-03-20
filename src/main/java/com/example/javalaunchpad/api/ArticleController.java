package com.example.javalaunchpad.api;


import lombok.AllArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@AllArgsConstructor
public class ArticleController {


    // private ArticleService articleService ;

    //@GetMapping("/")
    // public String helloWorld(){
        //    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //  return "ok you are logged in " + authentication.getName() ;
        //}
    // @GetMapping("/session")
    //public String getSession(HttpServletRequest request ){
        // SecurityContext springSecurityContext =(SecurityContext) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        //  return springSecurityContext.getAuthentication().getName();
        // }

    // we will return only ArticleResponse from our endpoint and we will take only ArticleRequest
    //  @GetMapping("/")
    // public List<ArticleResponse> getAllArticles(){
        //  List<ArticleResponse> articleResponses = new ArrayList<>();
        //  List<Article> articles = articleService.getAllArticles();
         // TO DO : map the articles to articleResponses
        //  return  articleResponses ;
        //}
    // TO DO :  validation needed here
    //   @PostMapping("")
    // public ArticleResponse saveArticle(@RequestBody ArticleRequest articleRequest){
        //  Article articleToBeSaved = new Article(); // TO DO :  map the ArticleRequest to an article entity  then save it to our database
        //  Article article =articleService.saveArticle( articleToBeSaved ) ;
        //   ArticleResponse articleResponse = new ArticleResponse();  //Map the Article to an Article  Response
        //   return articleResponse ;
        // }
    // @GetMapping("/{id}")
    //  public ArticleResponse getArticleById(@PathVariable long id) throws RessourceNotFoundException {
        //   Article article = articleService.getArticleById(id) ;
        //   ArticleResponse articleResponse = new ArticleResponse(); // map the article to an article response
        //   return  articleResponse ;
        // }
    // @PutMapping("/")
    //  public ArticleResponse updateArticle(@RequestBody ArticleRequest articleRequest) throws RessourceNotFoundException {
        // TO DO :  map the ArticleRequest to an article entity  then save it to our database
        //       Article articleToUpdated = new Article(); // TO DO :  map the ArticleRequest to an article entity  then save it to our database
        //      Article article =articleService.updateArticle( articleToUpdated ) ;
        //     ArticleResponse articleResponse = new ArticleResponse();  //Map the Article to an Article  Response
        //    return articleResponse ;
        // }
    // @DeleteMapping("/{id}")
    // public void  getAllArticles(@PathVariable Long id) throws RessourceNotFoundException {
        //   articleService.deleteArticle(id);
   // }





    @GetMapping("/test")
    public String test( ){

        return "test test " + SecurityContextHolder.getContext().getAuthentication().getName();
    }




}

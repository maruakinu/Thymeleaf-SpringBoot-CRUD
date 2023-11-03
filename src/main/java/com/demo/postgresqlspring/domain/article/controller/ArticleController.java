package com.demo.postgresqlspring.domain.article.controller;

import com.demo.postgresqlspring.domain.article.dto.ArticleDto;
import com.demo.postgresqlspring.domain.article.entity.ArticleEntity;
import com.demo.postgresqlspring.domain.article.repository.ArticleRepository;
import com.demo.postgresqlspring.domain.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@RestController
@Controller
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @Autowired
    ArticleRepository articleRepository;

//    @PostMapping("/post")
//    public ArticleDto<ArticleEntity> saveArticle(@RequestBody ArticleEntity article){
//        return articleService.saveArticle(article);
//    }
//    @PostMapping("/post")
//    public ArticleDto<ArticleEntity> saveArticle(@RequestBody ArticleEntity article){
//        return articleService.saveArticle(article);
//    }

    @PostMapping("/saveArticle")
    public String saveEmployee(@ModelAttribute("article") ArticleEntity article) {
        // save employee to database
        articleService.saveArticle(article);
        return "redirect:/";
    }

//    @GetMapping("/article/{id}")
//    public ArticleDto<ArticleEntity> getArticleById(@PathVariable int id){
//        return articleService.getArticleById(id);
//    }

    @GetMapping("/getArticleByID/{id}")
    public String editTutorial(@PathVariable("id") Integer id, Model model) {

        ArticleEntity article = articleRepository.findByID(id);

            model.addAttribute("article", article);

            return "update_article";

    }

//    @GetMapping("/all")
//    public ArticleDto<List<ArticleEntity>> getallArticles(){
//        return articleService.getAllArticles();
//    }
    @GetMapping("/")
    public ModelAndView getAll(){
        List<ArticleEntity> articles = articleRepository.findAll();
        return new ModelAndView("index").addObject("articles", articles);
    }

    @GetMapping("/showNewArticleForm")
    public String showNewEmployeeForm(Model model) {
        ArticleEntity article = new ArticleEntity();
        model.addAttribute("article", article);
        return "add_article";
    }

    @PutMapping("/article/{id}")
    public ArticleDto<ArticleEntity> updateArticle(@RequestBody ArticleEntity article, @PathVariable Integer id){
        return articleService.updateStudent(article, id);
    }

//    @DeleteMapping("/article/{id}")
//    public ArticleDto<String> deleteArticle(@PathVariable int id){
//        return articleService.deleteArticle(id);
//    }

    @GetMapping("/deleteArticle/{id}")
    public String deleteEmployee(@PathVariable(value = "id") int id) {

        // call delete employee method
        articleService.deleteArticle(id);
        return "redirect:/";
    }



}

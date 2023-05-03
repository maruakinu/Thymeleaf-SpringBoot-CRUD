package com.demo.postgresqlspring.domain.article.controller;

import com.demo.postgresqlspring.domain.article.dto.ArticleDto;
import com.demo.postgresqlspring.domain.article.entity.ArticleEntity;
import com.demo.postgresqlspring.domain.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/post")
    public ArticleDto<ArticleEntity> saveArticle(@RequestBody ArticleEntity article){
        return articleService.saveArticle(article);
    }

    @GetMapping("/article/{id}")
    public ArticleDto<ArticleEntity> getArticleById(@PathVariable int id){
        return articleService.getArticleById(id);
    }

    @PutMapping("/article/{id}")
    public ArticleDto<ArticleEntity> updateArticle(@RequestBody ArticleEntity article, @PathVariable Integer id){
        return articleService.updateStudent(article, id);
    }




}

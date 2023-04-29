package com.demo.postgresqlspring.domain.article.controller;

import com.demo.postgresqlspring.domain.article.dto.ResponseStructure;
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
    public ResponseStructure<ArticleEntity> saveArticle(@RequestBody ArticleEntity article){
        return articleService.saveArticle(article);
    }

    @GetMapping("/article/{id}")
    public ResponseStructure<ArticleEntity> getStudentById(@PathVariable int id){
        return null;
    }


}

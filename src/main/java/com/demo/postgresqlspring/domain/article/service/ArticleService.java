package com.demo.postgresqlspring.domain.article.service;

import com.demo.postgresqlspring.domain.article.dao.ArticleDao;
import com.demo.postgresqlspring.domain.article.dto.ArticleDto;
import com.demo.postgresqlspring.domain.article.entity.ArticleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    ArticleDao articleDao;

    public ArticleDto<ArticleEntity> saveArticle(ArticleEntity article){
        ArticleDto<ArticleEntity> responseStructure = new ArticleDto<ArticleEntity>();
        ArticleEntity article1 = articleDao.saveArticle(article);
        if(article1 != null) {
            responseStructure.setData(article1);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("Article saved successfully");
        } else {
            responseStructure.setData(null);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("Article has failed to save");
        }
        return responseStructure;
    }

    public ArticleDto<ArticleEntity> getArticleById(Integer id){
        ArticleDto<ArticleEntity> responseStructure = new ArticleDto<ArticleEntity>();
        ArticleEntity article = articleDao.getArticleById(id);
        if(article != null) {
            responseStructure.setData(article);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("Article got by id");
        } else {
            responseStructure.setData(null);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("Article don't exists");
        }
        return responseStructure;
    }

    public ArticleDto<ArticleEntity> updateStudent(ArticleEntity article, Integer id){
        ArticleDto<ArticleEntity> responseStructure = new ArticleDto<ArticleEntity>();
        ArticleEntity newArticle = articleDao.updateArticle(article, id);
        if(newArticle != null) {
            responseStructure.setData(newArticle);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("Student updated successfully");
        } else {
            responseStructure.setData(null);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("Student don't exists");
        }
        return responseStructure;
    }


}

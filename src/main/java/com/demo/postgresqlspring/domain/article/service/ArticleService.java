package com.demo.postgresqlspring.domain.article.service;

import com.demo.postgresqlspring.domain.article.dao.ArticleDao;
import com.demo.postgresqlspring.domain.article.dto.ResponseStructure;
import com.demo.postgresqlspring.domain.article.entity.ArticleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    ArticleDao articleDao;

    public ResponseStructure<ArticleEntity> saveArticle(ArticleEntity article){
        ResponseStructure<ArticleEntity> responseStructure = new ResponseStructure<ArticleEntity>();
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

}

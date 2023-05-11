package com.demo.postgresqlspring.domain.article.service;

import com.demo.postgresqlspring.domain.article.dao.ArticleDao;
import com.demo.postgresqlspring.domain.article.dto.ArticleDto;
import com.demo.postgresqlspring.domain.article.entity.ArticleEntity;
import com.demo.postgresqlspring.domain.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    ArticleDao articleDao;

    @Autowired
    ArticleRepository articleRepository;

    public ArticleDto<ArticleEntity> saveArticle(ArticleEntity article){
        ArticleDto<ArticleEntity> responseStructure = new ArticleDto<ArticleEntity>();
  //      ArticleEntity article1 = articleRepository.save(article);

        if(article.getTitle() == "") {
            responseStructure.setData(null);
            responseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
            responseStructure.setMessage("Article has failed to save");
        }else if(article != null) {
            ArticleEntity article1 = articleRepository.save(article);
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
            responseStructure.setMessage("Article updated successfully");
        } else {
            responseStructure.setData(null);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("Article don't exists");
        }
        return responseStructure;
    }


    public ArticleDto<String> deleteArticle(Integer id){
        ArticleDto<String> responseStructure = new ArticleDto<String>();
        boolean isTrue = articleDao.deleteArticle(id);
        if(isTrue) {
            responseStructure.setData("Article selected");
            responseStructure.setStatusCode(HttpStatus.OK.value());
            responseStructure.setMessage("Article deleted successfully");
        } else {
            responseStructure.setData("Article not selected");
            responseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
            responseStructure.setMessage("Article has failed to get delete");
        }
        return responseStructure;
    }

    public ArticleDto<List<ArticleEntity>> getAllArticles(){
        ArticleDto<List<ArticleEntity>> responseStructure = new ArticleDto<List<ArticleEntity>>();
        List<ArticleEntity> article = articleDao.getAllArticles();
        if(article.size() > 0) {
            responseStructure.setData(article);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("Here are the list of all Articles");
        } else {
            responseStructure.setData(null);
            responseStructure.setStatusCode(HttpStatus.CREATED.value());
            responseStructure.setMessage("No article record exists in database");
        }
        return responseStructure;
    }

}

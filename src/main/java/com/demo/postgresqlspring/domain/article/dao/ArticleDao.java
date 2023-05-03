package com.demo.postgresqlspring.domain.article.dao;

import com.demo.postgresqlspring.domain.article.entity.ArticleEntity;
import com.demo.postgresqlspring.domain.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ArticleDao {

    @Autowired
    ArticleRepository articleRepository;

    // save student
    public ArticleEntity saveArticle(ArticleEntity article) {
        return articleRepository.save(article);
    }

    // get student by id
    public ArticleEntity getArticleById(int id) {
        Optional<ArticleEntity> optional = articleRepository.findById(id);
        if(optional.isEmpty()) {
            return null;
        } else return optional.get();
    }

    public ArticleEntity updateArticle(ArticleEntity article, int id) {
        ArticleEntity existingarticle = getArticleById(id);
        if(existingarticle != null) {
            existingarticle.setTitle(article.getTitle());
            existingarticle.setDescription(article.getDescription());
            return articleRepository.save(existingarticle);
        } else return null;
    }

    public Boolean deleteArticle(int id) {
        Optional<ArticleEntity> optional = articleRepository.findById(id);
        if(optional.isPresent()) {
            articleRepository.delete(optional.get());
            return true;
        } else return false;
    }


}

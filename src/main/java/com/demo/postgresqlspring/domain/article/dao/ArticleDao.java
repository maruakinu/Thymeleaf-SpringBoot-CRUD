package com.demo.postgresqlspring.domain.article.dao;

import com.demo.postgresqlspring.domain.article.entity.ArticleEntity;
import com.demo.postgresqlspring.domain.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDao {

    @Autowired
    ArticleRepository articleRepository;

    // save student
    public ArticleEntity saveArticle(ArticleEntity article) {
        return articleRepository.save(article);
    }


}

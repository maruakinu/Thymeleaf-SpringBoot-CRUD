package com.demo.postgresqlspring.domain.article.repository;

import com.demo.postgresqlspring.domain.article.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {

}
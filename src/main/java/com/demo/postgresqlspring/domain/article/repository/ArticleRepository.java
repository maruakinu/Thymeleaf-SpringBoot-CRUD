package com.demo.postgresqlspring.domain.article.repository;

import com.demo.postgresqlspring.domain.article.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {
    @Query("SELECT u FROM ArticleEntity u WHERE u.id = :id")
    ArticleEntity findByID(@Param("id") Integer id);



}
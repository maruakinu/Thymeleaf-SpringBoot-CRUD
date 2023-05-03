package com.demo.postgresqlspring.domain.article.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ArticleDto<T> {

    private int statusCode;
    private String message;
    private T data;


}


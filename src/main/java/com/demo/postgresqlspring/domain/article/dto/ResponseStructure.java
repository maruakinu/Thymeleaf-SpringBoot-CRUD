package com.demo.postgresqlspring.domain.article.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseStructure <T> {

    private int statusCode;
    private String message;
    private T data;


}


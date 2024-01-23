package com.example.webappdemo.article.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class ArticleService {

    public String readOne(){
        return "readOne";
    }
}

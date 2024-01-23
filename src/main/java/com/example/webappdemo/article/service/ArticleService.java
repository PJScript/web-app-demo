package com.example.webappdemo.article.service;

import com.example.webappdemo.article.dto.ArticleDto;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Getter
@Service
public class ArticleService {


    /**
     * 게시글을 하나 생성하는 서비스 메서드
     * @return {@link com.example.webappdemo.article.dto.ArticleDto}
     */
    public String createArticle(){
        return "createArticle";
    }

    /**
     * 게시글을 하나 조회하는 서비스 메서드
     * @return {@link com.example.webappdemo.article.dto.ArticleDto}
     */
    public String readOne(Long id){
        log.info("id" + id);
        return "readOne";
    }

    /**
     * 모든 게시물을 페이징하여 조회하는 서비스 메서드
     * @param offset 건너뛸 갯수 ( 페이지 )
     * @param limit 가져올 데이터의 갯수 ( 페이지당 게시물 갯수 )
     * @return {@link com.example.webappdemo.article.dto.ArticleDto}
     */
    public String readAll(
            Integer offset,
            Integer limit
    ){
        log.info("offset" + offset);
        log.info("limit" + limit);
        return "readAll";
    }
}

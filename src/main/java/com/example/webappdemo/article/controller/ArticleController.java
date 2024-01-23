package com.example.webappdemo.article.controller;

import com.example.webappdemo.article.repository.ArticleRepository;
import com.example.webappdemo.article.service.ArticleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/article")
@AllArgsConstructor
public class ArticleController {
    private final ArticleService articleService;



    /**
     * 특정 게시글 읽어오는 메서드
     * @param id
     */
    @GetMapping("/{id}")
    public void readOne(
            @PathVariable String id
    ){
        log.info("id: " + id);
        articleService.readOne();
    }

    /**
     * 게시글 페이징해서 읽어오는 메서드
     */
    @GetMapping()
    public void read(
            @RequestParam("offset")
            Long offset,
            @RequestParam("limit")
            Long limit
    ){
        log.info("offset: " + offset);
        log.info("limit: " + limit);
    }




}

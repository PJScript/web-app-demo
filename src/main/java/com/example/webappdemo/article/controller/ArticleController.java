package com.example.webappdemo.article.controller;

import com.example.webappdemo.article.repository.ArticleRepository;
import com.example.webappdemo.article.service.ArticleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/articles")
@AllArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    /**
     * 게시글 생성하는 컨트롤러
     * @return String
     */
    @PostMapping()
    public String createArticle(

    ){
        return articleService.createArticle();
    }

    /**
     * 게시글 페이징해서 읽어오는 컨트롤러
     * @return String
     */
    @GetMapping()
    public String readAll(
            @RequestParam(value = "offset", defaultValue = "0")
            Integer offset,
            @RequestParam(value = "limit", defaultValue = "20")
            Integer limit
    ) {
        log.info("offset: " + offset);
        log.info("limit: " + limit);
        return articleService.readAll(offset, limit);
    }

    /**
     * 특정 게시글 읽어오는 컨트롤러
     *
     * @param id
     * @return String
     */
    @GetMapping("/{id}")
    public String readOne(
            @PathVariable Long id
    ) {
        log.info("id: " + id);
        return articleService.readOne(id);
    }




}

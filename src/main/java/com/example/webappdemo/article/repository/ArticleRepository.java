package com.example.webappdemo.article.repository;

import com.example.webappdemo.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {

}

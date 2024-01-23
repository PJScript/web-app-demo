package com.example.webappdemo.article.entity;

import com.example.webappdemo.article.dto.ArticleDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    /**
     * dto를 entity로 변환하는 factory 메서드 ( 기본 ArticleDto )
     * @param dto
     * @return
     */
    public ArticleDto toEntity(ArticleDto dto){
        return new ArticleDto(
                dto.getId(),
                dto.getTitle(),
                dto.getContent(),
                dto.getCreatedAt(),
                dto.getUpdatedAt()
        );
    }

    // 메서드 오버로딩으로 여러개의 동일한 이름의 메서드를 생성할 수 있다. 반드시 매개변수가 달라야 한다.
    // ArticleExampleDto, ArticleTestDto 등 여러개의 다른 타입으로 받아서 사용할 수 있다.
    public String toEntity(String str){
      return str;
    }

    public Integer toEntity(Integer num){
        return num;
    }

}

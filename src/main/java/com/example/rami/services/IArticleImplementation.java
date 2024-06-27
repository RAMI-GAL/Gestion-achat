package com.example.rami.services;

import com.example.rami.entities.Article;
import com.example.rami.repositories.ArticleRepository;


public class IArticleImplementation implements IArticle{
    ArticleRepository articleRepository;

    public IArticleImplementation(ArticleRepository articleRepository){
        this.articleRepository=articleRepository;
    }
    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }
}



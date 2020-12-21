package com.example.demo.cop.bbs.service;
import java.util.List;

import com.example.demo.cop.bbs.service.model.Article;
import com.example.demo.cop.bbs.service.model.Reply;

import org.springframework.stereotype.Component;
@Component
public interface ArticleService {
    public void writeArticle(Article article);
    public void modifyArticle(Article article);
    public void removeArticle(Article article);
    public void writeReply(Reply reply);
    public void removeReply(Reply reply);
    public Article readArticle(int artId);
    public List<Reply> readReply(int artId);
}
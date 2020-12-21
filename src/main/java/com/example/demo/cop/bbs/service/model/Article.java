package com.example.demo.cop.bbs.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component @Data
public class Article {
   private String artNum, title, content, count, writerNum;
}
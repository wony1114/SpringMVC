package com.example.demo.cop.bbs.service;

import org.springframework.stereotype.Component;

import lombok.Data;




@Component @Data
public class Article {
   private String artNum, title, content, count, writerNum;
}
/*
create table articles(
   art_num int primary key ,
   title varchar2(20),
   content varchar2(20),
   count varchar2(20),
   writer_num int
   )
*/
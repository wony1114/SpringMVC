package com.example.demo.sym.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class Manager {
    private String mgrNum, email, password;
}
/*
 create table managers( 
 mgr_num varchar2(10) primary key,
 email varchar2(20),
 password varchar2(20)
 )
 */

package com.example.demo.sym.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.sym.service.Manager;
import com.example.demo.sym.service.ManagerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/managers")
public class ManagerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired ManagerService managerService;

    @PostMapping("")
    public Map<?, ?> register(@RequestBody Manager manager) {
        var map = new HashMap<>();
        logger.info("등록하려는 관리자정보: " + manager.toString());
        map.put("message", (managerService.register(manager) == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }
}

package com.example.demo.sym.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.sym.service.Manager;
import com.example.demo.sym.service.ManagerMapper;
import com.example.demo.sym.service.ManagerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/managers")
public class ManagerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired ManagerService managerService;
    @Autowired ManagerMapper managerMapper;

    @PostMapping("")
    public Messenger register(@RequestBody Manager manager) {
        return (managerService.register(manager) == 1) ? Messenger.SUCCESS : Messenger.FAILURE;
    }
    @PostMapping("/access")
    public Manager access(@RequestBody Manager manager) {
    	return managerMapper.access(manager);
    }
}

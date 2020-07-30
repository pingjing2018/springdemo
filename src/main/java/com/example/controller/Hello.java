package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2020-07-30 8:28
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world11122呃呃33";

    }}

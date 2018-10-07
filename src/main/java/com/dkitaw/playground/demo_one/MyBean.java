package com.dkitaw.playground.demo_one;

import org.springframework.boot.*;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
// @Component
public class MyBean {
// @Autowired
public MyBean(ApplicationArguments args) {
 boolean debug = args.containsOption("debug");
 List<String> files = args.getNonOptionArgs();
 System.out.println(files);
 
 }
}
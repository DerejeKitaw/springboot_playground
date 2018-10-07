package com.dkitaw.playground.demo_two;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**

 @RestController  // @RestController known as a stereotype annotation. 
 @EnableAutoConfiguration
 public class Home {
   @RequestMapping("/")
   String home() {
     return "Hello World!";
    }
  }
*/
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api")
public class DemoController {

  @GetMapping("/demo")
  public String getDemoNote() {
    return  "[Hello World - Here is the Demo!]";
  }

}

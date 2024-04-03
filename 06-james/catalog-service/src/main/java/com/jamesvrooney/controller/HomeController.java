package com.jamesvrooney.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/")
  public String getGreeting() {
    return "Hello James from Chapter06";
  }
}

package com.example.githubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping("/")
  public String main () {
    return "This is manual cicd test server.";
  }
}

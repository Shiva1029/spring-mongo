package com.example.demo.Controllers;

import com.example.demo.Entity.Author;
import com.example.demo.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
  private AuthorService authorService;

  @Autowired
  public HomeController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @GetMapping("/authors")
  public List<Author> authors() {
    return this.authorService.getAuthors();
  }
}

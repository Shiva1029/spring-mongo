package com.example.demo.Services;

import com.example.demo.Entity.Author;
import com.example.demo.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
  private AuthorRepository authorRepository;

  @Autowired
  public AuthorService(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public List<Author> getAuthors() {
    return this.authorRepository.findAll();
  }
}

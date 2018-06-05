package com.example.demo;

import com.example.demo.Entity.Author;
import com.example.demo.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private AuthorRepository authorRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        authorRepository.deleteAll();

        authorRepository.save(new Author("Alice", "Smith"));
        authorRepository.save(new Author("Bob", "Smith"));
    }
}

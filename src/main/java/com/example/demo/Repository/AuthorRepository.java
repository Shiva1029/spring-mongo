package com.example.demo.Repository;

import com.example.demo.Entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, BigInteger> {
  List<Author> findAll();

  Author findAuthorById(BigInteger id);
}
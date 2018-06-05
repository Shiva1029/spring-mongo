package com.example.demo.Repository;

import com.example.demo.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, BigInteger> {

  List<Post> findAllByOrderByCreatedOnDesc();

  List<Post> findAllByAuthorFirstNameLikeIgnoreCaseOrderByCreatedOnDesc(String firstName);
}
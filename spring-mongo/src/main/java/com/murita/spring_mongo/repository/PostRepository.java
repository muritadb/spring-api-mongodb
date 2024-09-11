package com.murita.spring_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.murita.spring_mongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}

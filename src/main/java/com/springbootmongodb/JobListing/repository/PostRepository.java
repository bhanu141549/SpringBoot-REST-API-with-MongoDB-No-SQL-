package com.springbootmongodb.JobListing.repository;

import com.springbootmongodb.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}

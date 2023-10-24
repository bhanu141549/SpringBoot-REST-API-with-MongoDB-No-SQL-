package com.springbootmongodb.JobListing.repository;

import com.springbootmongodb.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}

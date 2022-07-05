package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
interface PostRepository extends PagingAndSortingRepository<Post, Integer> {
    List<Post> findAll();

    List<Post> findByTitleContains(@Param("title") String name);

    List<Post> findByStatus(@Param("status") Integer status);
}

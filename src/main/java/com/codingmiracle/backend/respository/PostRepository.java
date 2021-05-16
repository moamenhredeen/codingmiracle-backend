package com.codingmiracle.backend.respository;

import com.codingmiracle.backend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "posts")
public interface PostRepository extends JpaRepository<Post, Integer> {
}

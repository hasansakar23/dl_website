package com.example.questapp.Repository.abs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questapp.Entities.concretes.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}

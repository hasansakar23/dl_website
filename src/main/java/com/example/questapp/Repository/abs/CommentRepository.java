package com.example.questapp.Repository.abs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questapp.Entities.concretes.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}

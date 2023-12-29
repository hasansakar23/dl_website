package com.example.questapp.Repository.abs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questapp.Entities.concretes.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {

}

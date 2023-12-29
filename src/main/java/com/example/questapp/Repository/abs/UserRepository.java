package com.example.questapp.Repository.abs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.questapp.Entities.concretes.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

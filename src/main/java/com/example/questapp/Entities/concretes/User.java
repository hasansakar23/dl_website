package com.example.questapp.Entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="puser")
public class User {
	@Id
	Long id;
	String userName;
	String password;
	


}

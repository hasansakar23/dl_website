package com.example.questapp.Entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity
@Data

public class Like {
	@Id
	Long id;
	Long postId;
	Long userId;
	@Lob
	@Column(columnDefinition = "text")
	String text;

}

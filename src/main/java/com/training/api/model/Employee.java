package com.training.api.model;
import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private String mail;
	
	private String password;
}

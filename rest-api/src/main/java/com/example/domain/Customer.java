package com.example.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String birth;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String post_num;
	@Column(nullable = false)
	private String adress;
	@Column(nullable = false)
	private Integer num_of_buy;
	@Column(nullable = false)
	private String last_buy;
}
package com.Assignment.OAuth.Assignment.entites;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class user {
	@Id
	private Integer Id;
	private String name;
	private String credentials;
	@ManyToMany(fetch= FetchType.EAGER)
	@JoinTable(name="user_tenet", joinColumns = {@JoinColumn(name="user_id")}, 
			inverseJoinColumns = {@JoinColumn(name="tenet_id")})
	private Set<user> tenets;
}

package com.Assignment.OAuth.Assignment.entites;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class tenet implements GrantedAuthority {
	@Id
	private Integer Id;
	private String name;
	private String config;

	@ManyToMany(mappedBy = "tenets")
	private Set<user> users;

	@Override
	public String getAuthority() {
		return name;
	}
}

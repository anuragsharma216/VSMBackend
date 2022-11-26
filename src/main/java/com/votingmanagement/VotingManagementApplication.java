package com.votingmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class VotingManagementApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 

	public static void main(String[] args) {
		SpringApplication.run(VotingManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sqlUser = "INSERT INTO roles(name) VALUES (" + "'ROLE_USER')";
		String sqlAdmin = "INSERT INTO roles(name) VALUES (" + "'ROLE_ADMIN')";
		
		jdbcTemplate.update(sqlUser);
		jdbcTemplate.update(sqlAdmin);
		
	}

}

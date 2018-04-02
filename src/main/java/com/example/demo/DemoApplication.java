package com.example.demo;

import com.example.demo.dao.PlayerDao;
import com.example.demo.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	PlayerDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Player p1 = new Player("Joel", 15);
		Player p2 = new Player("Pedro", 22);
		dao.save(p1);
		dao.save(p2);
	}
}

package hh.yazeed.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import hh.yazeed.application.domain.Repository;
import hh.yazeed.application.domain.Student;
import hh.yazeed.application.domain.User;
import hh.yazeed.application.domain.UserRepository;
@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public CommandLineRunner appdemo(Repository srepository ,UserRepository urepository) {
		return (args) -> {
			log.info("save a couple of students");
			srepository.save(new Student("yazeed", "maswadeh", "yazeed@gmail.com", "a1604426","12"));
		

			// Create users: admin/admin user/user
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
		
			
			log.info("fetch all books");
			for (Student student : srepository.findAll()) {
				log.info(student.toString());
			}
		};
	}
}
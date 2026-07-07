package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member aaron = new Member(1, "Aaron", 10, "aaron@example.com");

		System.out.println("---");
		System.out.println(aaron);
		System.out.println(aaron.toString());

//		aaron.setId();
//		aaron.setName();
//		aaron.setAge(20);
		aaron.setEmail("aaron@different.com");

		System.out.println(aaron.getId());
		System.out.println(aaron.getName());
		System.out.println(aaron.getAge());
		System.out.println(aaron.getEmail());
	}
}
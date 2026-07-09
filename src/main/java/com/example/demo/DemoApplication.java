package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member aaron = new Member(1, "Aaron");

		System.out.println("---");
		System.out.println(aaron);
		System.out.println(aaron.toString);
		aaron.setAge(10);
		aaron.setEmail("aaron@example.com");
	}
}
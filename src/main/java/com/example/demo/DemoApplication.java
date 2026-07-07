package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member aaron = Member.builder()
				.id(1)
				.age(10)
				.name("Aaron")
				.email("aaron@example.com")
				.build();
		Member baron = Member.builder()
				.email("baron@example.com")
				.name("Baron")
				.age(20)
				.id(2)
				.build();

		System.out.println("---");
		System.out.println(aaron);
		System.out.println(aaron.toString());
		System.out.println(aaron.getName());

		System.out.println("---");
		System.out.println(baron);
		System.out.println(baron.toString());
		System.out.println(baron.getName());
	}
}
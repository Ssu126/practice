package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member aaron = new Member(
				1,
				"Aaron",
				10,
				"aaron@example.com"
		);
		Member baron = Member.builder()
				.id(2)
				.name("Baron")
				.age(20)
				.email("baron@example.com")
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
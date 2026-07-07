package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		String request = "AARON";
		Member.MemberBuilder builder = Member.builder()
				.age(10)
				.email("common@example.com");

		if(request.equals("AARON")){
			builder
					.id(1)
					.name("Aaron");
		} else if (request.equals("BARON")) {
			builder
					.id(2)
					.name("Baron");
		}

		Member aaron = builder.build();


		System.out.println("---");
		System.out.println(aaron);
		System.out.println(aaron.toString());
		System.out.println(aaron.getName());
	}
}
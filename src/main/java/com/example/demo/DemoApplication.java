package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member aaron = Member.builder()
				.name("Aaron")
				.email("aaron@example.com")
				.favorites(List.of("Game", "Animation"))
				.build();
		Member baron = Member.builder()
				.name("Baron")
				.email("baron@example.com")
				.favorite("Book")
				.favorite("Cook")
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
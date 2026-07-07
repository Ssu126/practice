package com.example.demo;

import com.example.demo.member.Administrator;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member aaron = new Member("Aaron");
		aaron.setEmail("aaron@example.com");
		Member baron = new Member("Baron");
		baron.setEmail("baron@example.com");

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
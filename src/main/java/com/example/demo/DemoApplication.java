package com.example.demo;

import com.example.demo.member.Member;
import com.example.demo.member.MemberRequestDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		MemberRequestDto dto = new MemberRequestDto("Aaron", "aaron@example.com");
		Member aaron = new Member(dto);

		System.out.println("---");
		System.out.println(aaron);
		System.out.println(aaron.toString());
		System.out.println(aaron.getName());
	}
}
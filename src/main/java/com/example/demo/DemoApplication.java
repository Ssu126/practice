package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member member = new Member(1, "Aaron", 10, "aaron@example.com");

		System.out.println("---");
		System.out.println(member);
		System.out.println(member.toString());

		System.out.println(member.MEMBER_TO_STRING_FORMAT);
		System.out.println(Member.MEMBER_TO_STRING_FORMAT);
	}
}
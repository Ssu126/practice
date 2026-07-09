package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		Member member = new Member(1, "Aaron", 10, "aaron@example.com");

		System.out.println("---");
		System.out.println(member);
		System.out.println(member.toString());

		System.out.println(member.MEMBER_TO_STRING_FORMAT);
		System.out.println(Member.MEMBER_TO_STRING_FORMAT);
		System.out.println(member.toString(member));
		System.out.println(Member.toString(member));

		Member.Favorite non_static_favorite_1 = member.new Favorite(Arrays.asList("BOOK", "COOK"));
		Member.Favorite non_static_favorite_2 = member.new Favorite(Arrays.asList("BOOK", "COOK"));
	}
}
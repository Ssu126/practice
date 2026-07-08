package com.example.demo;

import com.example.demo.dto.MemberCreateRequestDto;
import com.example.demo.member.Member;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		MemberCreateRequestDto requestDto = new MemberCreateRequestDto("Baron", "baron@example.com");
		Member aaron = new Member(1, "Aaron", 10, "aaron@example.com");
		Member baron = Member.from(requestDto);

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
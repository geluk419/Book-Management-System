package com.example.book.vo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemberVO {
	private String memberId;
	private String name;
	private String phoneNumber;
}
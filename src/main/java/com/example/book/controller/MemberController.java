package com.example.book.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.service.MemberService;
import com.example.book.vo.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	// 중복 확인
	@GetMapping(value = "/member",produces = "application/json;charset=utf-8")
	public int checkId(MemberVO memberVO){
		return memberService.checkId(memberVO);
	}

	// 회원 가입
	@PostMapping(value = "/member",produces = "application/json;charset=utf-8")
	public int insertMember(@RequestBody MemberVO memberVO){
		return memberService.insertMember(memberVO);
	}

	
}
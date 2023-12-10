package com.example.book.service;
import com.example.book.vo.MemberVO;

public interface MemberService {
	// 중복 확인
	int checkId(MemberVO memberVO);

	// 회원 가입
	int insertMember(MemberVO memberVO);
}
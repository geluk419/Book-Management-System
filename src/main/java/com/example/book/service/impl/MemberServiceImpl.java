package com.example.book.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.mapper.MemberMapper;
import com.example.book.service.MemberService;
import com.example.book.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberMapper memberMapper;
	
	// 중복 확인
	@Override
	public int checkId(MemberVO memberVO) {
		return memberMapper.checkId(memberVO);
	}

	// 회원 가입
	@Override
	public int insertMember(MemberVO memberVO) {
		return memberMapper.insertMember(memberVO);
	}

}
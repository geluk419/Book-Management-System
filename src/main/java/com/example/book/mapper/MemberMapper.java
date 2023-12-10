package com.example.book.mapper;
import org.apache.ibatis.annotations.Mapper;

import com.example.book.vo.MemberVO;

@Mapper
public interface MemberMapper {
	// 중복 확인
	int checkId(MemberVO memberVO);
	
	// 회원 가입
	int insertMember(MemberVO memberVO);
}
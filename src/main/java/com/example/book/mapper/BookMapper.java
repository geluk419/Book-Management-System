package com.example.book.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.book.vo.BookVO;

@Mapper
public interface BookMapper {
	  // 도서 목록
	  List<BookVO> listBook();
	  
	  // 도서 등록
	  int insertBook(BookVO bookVO);

	  // 도서 수정
	  int updateBook(BookVO bookVO);
}
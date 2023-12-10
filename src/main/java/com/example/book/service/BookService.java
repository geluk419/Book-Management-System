package com.example.book.service;
import java.util.List;

import com.example.book.vo.BookVO;

public interface BookService {
	// 도서 목록
	List<BookVO> listBook();

	// 도서 등록
	int insertBook(BookVO bookVO);
	
	// 도서 수정
	int updateBook(BookVO bookVO);
}
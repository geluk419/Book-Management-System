package com.example.book.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.mapper.BookMapper;
import com.example.book.service.BookService;
import com.example.book.vo.BookVO;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookMapper bookMapper;
	
	// 도서 목록
	@Override
	public List<BookVO> listBook() {
		return bookMapper.listBook();
	}

	// 도서 등록
	@Override
	public int insertBook(BookVO bookVO) {
		return bookMapper.insertBook(bookVO);
	}

	// 도서 수정
	@Override
	public int updateBook(BookVO bookVO) {
		return bookMapper.updateBook(bookVO);
	}

}
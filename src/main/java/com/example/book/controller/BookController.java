package com.example.book.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.service.BookService;
import com.example.book.vo.BookVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookService bookService;
	
	// 도서 목록
	@GetMapping(value = "/books",produces = "application/json;charset=utf-8")
	public List<BookVO> listBook(){
		return bookService.listBook();
	}

	// 도서 등록
	@PostMapping(value = "/book",produces = "application/json;charset=utf-8")
	public int insertBook(@RequestBody BookVO bookVO){
		log.info("bookVO나와랏"+bookVO);
		return bookService.insertBook(bookVO);
	}

	// 도서 수정
	@PutMapping(value = "/book",produces = "application/json;charset=utf-8")
	public int updateBook(@RequestBody BookVO bookVO){
		return bookService.updateBook(bookVO);
	}
	
}
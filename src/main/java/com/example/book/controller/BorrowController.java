package com.example.book.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.service.BorrowService;
import com.example.book.vo.BorrowVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class BorrowController {

	@Autowired
	private BorrowService borrowService;
	
	// 대출 이력
	@GetMapping(value = "/borrow/{bookCode}",produces = "application/json;charset=utf-8")
	public List<BorrowVO> listBorrow(@PathVariable String bookCode){
		BorrowVO borrowVO = new BorrowVO();
		borrowVO.setBookCode(bookCode);
		return borrowService.listBorrow(borrowVO);
	}
	
	// 도서 대출
	@PostMapping(value = "/borrow",produces = "application/json;charset=utf-8")
	public int borrowBook(@RequestBody BorrowVO borrowVO){
		return borrowService.borrowBook(borrowVO);
	}

	// 도서 반납
	@PutMapping(value = "/borrow",produces = "application/json;charset=utf-8")
	public int returnBook(@RequestBody BorrowVO borrowVO){
		return borrowService.returnBook(borrowVO);
	}
	
}
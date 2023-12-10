package com.example.book.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.mapper.BorrowMapper;
import com.example.book.service.BorrowService;
import com.example.book.vo.BorrowVO;

@Service
public class BorrowServiceImpl implements BorrowService{

	@Autowired
	private BorrowMapper borrowMapper;
	
	// 대출 이력
	@Override
	public List<BorrowVO> listBorrow(BorrowVO borrowVO) {
		return borrowMapper.listBorrow(borrowVO);
	}

	// 도서 대출
	@Override
	public int borrowBook(BorrowVO borrowVO) {
		return borrowMapper.borrowBook(borrowVO);
	}

	// 도서 반납
	@Override
	public int returnBook(BorrowVO borrowVO) {
		return borrowMapper.returnBook(borrowVO);
	}

}
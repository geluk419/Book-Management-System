package com.example.book.service;
import java.util.List;

import com.example.book.vo.BorrowVO;

public interface BorrowService {
	  // 대출 이력
	  List<BorrowVO> listBorrow(BorrowVO borrowVO);
	  
	  // 도서 대출
	  int borrowBook(BorrowVO borrowVO);
	  
	  // 도서 반납
	  int returnBook(BorrowVO borrowVO);
}
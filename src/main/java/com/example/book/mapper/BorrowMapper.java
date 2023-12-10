package com.example.book.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.book.vo.BorrowVO;

@Mapper
public interface BorrowMapper {
	  // 대출 이력
	  List<BorrowVO> listBorrow(BorrowVO borrowVO);

	  // 도서 대출
	  int borrowBook(BorrowVO borrowVO);

	  // 도서 반납
	  int returnBook(BorrowVO borrowVO);
}
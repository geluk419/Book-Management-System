package com.example.book.vo;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BorrowVO {
	private String borrowCode;
	private Date borrowDate;
	private Date returnDate;
	private String borrowStatus;
	private String memberId;
	private String bookCode;

	private String title;
}
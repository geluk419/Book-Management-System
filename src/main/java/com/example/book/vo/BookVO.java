package com.example.book.vo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BookVO {
	private String bookCode;
	private String title;
	private String author;
}
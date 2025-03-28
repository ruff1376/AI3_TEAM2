package MISSION.KGW.Q15;

import java.util.ArrayList;

public class Book {
	String isbn;
	String title;
	String writer;
	String content;
	int price;
	
	public Book() {
		this("번호없음", "제목없음", "작가없음", "내용없음", 0);
	}
	
	public Book(String isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}
	ArrayList<Book> bookList = new ArrayList<Book>();
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", content=" + content + ", price="
				+ price + "]";
	}
	
	public void bookList() {
		System.out.println("================= ALOHA 스터디 도서관 ================");
		for ( int i = 0; i < bookList.size(); i++) {
			String isbn = bookList.get(i).getIsbn();
			String title = bookList.get(i).getTitle();
			String writer = bookList.get(i).getWriter();
			String content = bookList.get(i).getContent();
			int price = bookList.get(i).getPrice();
			System.out.println(isbn + "|" + title+"\t|"+writer+"\t|"+content+"\t\t|"+price);
		}
	}
	
	
	
}

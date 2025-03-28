package MISSION.HJY.Q15;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Library {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		DecimalFormat df = new DecimalFormat("000000");
		Collections.addAll(bookList, new Book(123123, "이게 자바냐", "감자바", "자바 감자바", 33000),
									 new Book(112112, "정보처리기사", "김휴먼", "국가기술자격", 45000),
									 new Book(1001, "실무 DB", "박디비", "디비디비딥", 60000));
		
		System.out.println("====================ALOHA 스터디 도서관====================");
		for (Book book : bookList)
			System.out.println(df.format(book.getIsbn()) + "|" + book.getTitle()
			+ "\t   |" + book.getWriter() + "     |" + book.getContent() + "\t\t|" + book.getPrice());
	}
	
}

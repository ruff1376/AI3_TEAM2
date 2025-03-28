package MISSION.KGW.Q15;

import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {
		Book library = new Book();
		ArrayList<Book> bookList = new ArrayList<Book>();
		Book book1 = new Book("123123","이게자바냐","감자바","자바 감자바", 33000);
		Book book2 = new Book("112112","정보처리기사","김휴먼","국가기술자격", 45000);
		Book book3 = new Book("001001","실무 DB","박디비","디비디비딥 ", 60000);
		library.bookList.add(book1);
	    library.bookList.add(book2);
	    library.bookList.add(book3);
		
		library.bookList();
	}
}

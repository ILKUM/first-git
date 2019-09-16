package kr.or.bit;
/*
 책은 이름을 가지고 있고 가격을 가지고 있다
 책이 출판되면 반드시 책이름과 책의 가격을 가지고 있어야 한다
 책의 이름과 가격정보는 특정 기능을 통해서만 볼수 있고 ,출판된 이후에서 수정할 수 없다
 책이름과 가격정보는 각각 확인할 수 있다
 */
public class Book {

	private String bookName;
	
	private int bookPrice;
	
	public Book(String bookName, int bookPrice){
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public void nameBook() {
		System.out.println("책 이름 : " + bookName);
	}
	
	public void priceBook() {
		System.out.println("책 가격 : " + bookPrice);
	}
	
	public void infoBook() {
		System.out.printf("책 이름 : %s , 책 가격 : %d\n", bookName, bookPrice);
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}
	
	
	
	
}

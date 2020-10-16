package main;

public class Person {
	private String name;
	private String date;
	
	Book book = new Book();

	public Person(String name) {
		this.name = name;
	}
	public void borrowBook(String bookTitle) {
		if(book.getTitle() == bookTitle && book.isIsAvailable() == true) {
				book.setBorrower(name);
				book.setIsAvailable(false);}
		else{
			if(book.getReturnDate() == date) {
				Reply response = Reply.Wait;
			}else {
				Reply response = Reply.ComeBackLater;
			 }
			}
		}

}

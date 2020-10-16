package main;

public class Book {
	private String title;
	private boolean IsAvailable;
	private String borrower;
	private String returnDate;
	
	public Book() {}
	
	public Book(String title, boolean isAvailable, String borrower, String returnDate) {
		this.title = title;
		IsAvailable = isAvailable;
		this.borrower = borrower;
		this.returnDate = returnDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isIsAvailable() {
		return IsAvailable;
	}
	public void setIsAvailable(boolean isAvailable) {
		IsAvailable = isAvailable;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
}

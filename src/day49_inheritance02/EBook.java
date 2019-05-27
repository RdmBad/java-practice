package day49_inheritance02;

public class EBook extends Book {
	private int size;
	private int pages;
	
	public void readBook(int pageNum) {
		System.out.println("Reading " + getTitle() + " by " + getAuthor() + " at page " + pageNum);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "EBook [size=" + size + ", pages=" + pages + ", getTitle()=" + getTitle() + ", getType()=" + getType()
				+ ", getAuthor()=" + getAuthor() + ", getPrice()=" + getPrice() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}

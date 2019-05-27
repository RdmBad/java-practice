package day49_inheritance02;

public class BarnesAndNobles {
	public static void main(String[] args) {
		EBook ebook = new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		
		ebook.readBook(10);
		ebook.readBook(621);
		
		
		AudioBook aBook = new AudioBook();
		aBook.setTitle("OCA preparation");
		aBook.setAuthor("Jeanne");
		aBook.setNarrator("Marufjon");
		
		aBook.listen();

		PaperBack pb = new PaperBack();
		pb.setAuthor("Malcom Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		System.out.println(pb.toString());
	}
}

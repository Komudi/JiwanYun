import java.util.Scanner;

class Book2 {
	String title, author;
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book2 [] book = new Book2[2];
		
		for(int i = 0; i < book.length; i++) {
			System.out.print("����>>");
			String title = sc.nextLine();
			System.out.print("����>>");
			String author = sc.nextLine();
			
			book[i] = new Book2(title, author);
		}
		
		for(int i = 0; i < book.length; i++) {
			System.out.print("(" + book[i].title +"," + book[i].author+")");
		}

	}

}
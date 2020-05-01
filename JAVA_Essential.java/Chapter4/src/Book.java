
public class Book {
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
	
	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book(String t) {
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book javabook = new Book("Java", "황기태");
		Book bible = new Book("Bible");
		Book empoty = new Book();
		
		bible.show();
	}

}

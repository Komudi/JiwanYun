
public class Book {
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
	
	public Book() {
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public Book(String t) {
		title = t;
		author = "���ڹ̻�";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book javabook = new Book("Java", "Ȳ����");
		Book bible = new Book("Bible");
		Book empoty = new Book();
		
		bible.show();
	}

}

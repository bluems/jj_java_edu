package ex4_5;

public class Book {

	String title;
	String author;
	void show(){
		System.out.println(title + " " + author);
	}
	
	public Book(){
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public Book(String title)
	{
		this(title,"���ڹ̻�");
	}
	
	public Book(String title, String author)
	{
		this.title = title; this.author = author;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book javaBook = new Book("Java", "Ȳ����");
		Book bible = new Book("Bible");
		Book emptyBook = new Book();
		
		javaBook.show();
		bible.show();
		emptyBook.show();
	}

}

import java.util.Scanner;

class Book03{
	String title, author;
	public Book03(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book03[] book = new Book03[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < book.length; i++) {
			System.out.print("제목 >> ");
			String title = scanner.nextLine();
			System.out.print("작가 >> ");
			String author = scanner.nextLine();
			
			book[i] = new Book03(title, author);
		}
		
		for(int i = 0 ; i<book.length; i++) {
			System.out.println("(" + book[i].title + ", " + book[i].author + ")");
		}
	}

}

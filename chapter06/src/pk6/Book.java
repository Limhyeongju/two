package pk6;

public class Book {

	public String bookname;//멤버변수
	public String author;// 멤버변수
	
	
	
	public Book() {};// 생성자 : 클래스를 초기화
	//클래스 이름과 같아야한다 book으로 쓰면 오류
	//외부에서 Book bk=new Book[i]에서 쓸 떄 힙메모리를 만든다 눈에 안보이지만 항상 있다.
	//너도 나도 쓸수 있다
	
	// 메소드나 생성자는 같은이름이 중복될수 없다.
	//그러나 매개변수의 갯수나 타입이 다르면 올수있다.
	//다형성
	
	//생성자의 다형성=오버로딩
	public Book(String bookname, String author) {
				this.bookname=bookname; //this. 멤버변수에 기억된다
				this.author= author;
	}// source -> getters and setters 에서 적용
	public String getBookname() {
		return bookname;//요청한곳에서 던져줄게 return
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo() {
		System.out.println(bookname+" "+author);
	}
}

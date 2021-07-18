package pk6;

//깊은 복사
public class ArrayCopy04 {

	public static void main(String[] args) {
		Book[] bookArray1=new Book[3];
		Book bookArray2[]=new Book[3];
		
		bookArray1[0]=new Book("1","2"); 
		bookArray1[1]=new Book("3","4");
		bookArray1[2]=new Book("5","6");
		
		bookArray2[0]=new Book(); // 객체를 직접 생성
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		for(int i=0;i<bookArray1.length; i++) {
			bookArray1[i].setBookname(bookArray1[i].getBookname());
			bookArray1[i].setAuthor(bookArray1[i].getAuthor()); //갖고와서 이쪽에 넣는것
		}
		for(int i=0;i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			System.out.println("==원본==");
			
		
			
		
}
		}
	}

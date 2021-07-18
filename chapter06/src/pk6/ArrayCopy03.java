package pk6;

public class ArrayCopy03 {
// 얕은 복사
	public static void main(String[] args) {
		Book[] bookArray1=new Book[3];
		Book bookArray2[]=new Book[3];
		
		bookArray1[0]=new Book("1","2"); //괄호부분의 값이 바꾸어도 갱신해서 쓸수 있는법
		bookArray1[1]=new Book("3","4");
		bookArray1[2]=new Book("5","6");
		
		
		System.arraycopy(bookArray1, 0, bookArray2,0,3);
		System.out.println("===변경전====");
		for(int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
			

		
		}
		System.out.println("===원본=====");
		bookArray1[0].setBookname("나 목");
		bookArray1[0].setAuthor("박완서");
		for(int i=0; i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("===복사본=====");
		//원본의 영향을 받는다
		for(int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
}
	}

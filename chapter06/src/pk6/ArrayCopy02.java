package pk6;

import java.util.ArrayList;

public class ArrayCopy02 {

	public static void main(String[] args) {
		
		//배열크기 3개짜리 Book클래스의 인스턴스 변수 선언
		//bookArray1 ,2
		Book[] bookArray1=new Book[3];
		Book bookArray2[]=new Book[3];
		
		bookArray1[0]=new Book("1","2"); //괄호부분의 값이 바꾸어도 갱신해서 쓸수 있는법
		bookArray1[1]=new Book("3","4");
		bookArray1[2]=new Book("5","6");
		
		
		System.arraycopy(bookArray1, 0, bookArray2,0,3);
		
		for(int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		
		
		
		
		
		

	}

}

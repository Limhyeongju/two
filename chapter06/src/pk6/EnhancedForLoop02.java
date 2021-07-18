package pk6;

import java.util.ArrayList;

public class EnhancedForLoop02 {

	public static void main(String[] args) {
		ArrayList<Book> abc= new ArrayList<Book>();
		abc.add(new Book("태백산맥","조경래" ));
		abc.add(new Book("데미안","헤르만" ));
		abc.add(new Book("어떻게 살것 인가","유시민" ));
		abc.add(new Book("토지","박경리" ));
		abc.add(new Book("어린왕자","생텍쥐페리" ));
		
		for(int i=0; i<abc.size();i++) {
			Book book=abc.get(i); //abc[0]
			book.showBookInfo();//abc[0].showBookInfo()
		}
		
		System.out.println();
		System.out.println("--향상된 for문 사용--");
		for(Book book:abc) {
			book.showBookInfo();
		}
		//ArrayList : 배열에 동적메모리를 지원(사용한 만큼 메모리 할당)
		//Book[] abc=new Book[5];
		
		/*abc[0]=new Book("태백산맥","조경래" );
		abc[1]=new Book("데미안","헤르만" );
		abc[2]=new Book("어떻게 살것 인가","유시민" );
		abc[3]=new Book("토지","박경리" );
		abc[4]=new Book("어린왕자","생텍쥐페리" ); */ //위의 ArrayList로 변경
	}

}

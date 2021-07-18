package pk6;

public class BookArray02 {
	public static void main(String[] args) {
		Book[] abc=new Book[5];
		
		abc[0]=new Book("태백산맥","조경래" );
		abc[1]=new Book("데미안","헤르만" );
		abc[2]=new Book("어떻게 살것 인가","유시민" );
		abc[3]=new Book("토지","박경리" );
		abc[4]=new Book("어린왕자","생텍쥐페리" );
		//Book class에 저장된다.main에 저장되는게 아니라 힙메모리에 들어가기에
		// 그냥 int 땡땡은 statc메모리가 된다.
		//객체는 쉽게보면 데이터저장소에 필요한 요소를 끌어다쓰는것이라 생각하자
		
		/*System.out.println(abc[0].bookname);
		System.out.println(abc[0].bookname);
		System.out.println(abc[0].bookname);
		System.out.println(abc[0].bookname);
		System.out.println(abc[0].bookname);
		*/ //메인이 지저분해지는것
		
		for(int i=0;i<abc.length;i++) {
			abc[i].showBookInfo();
		}
		
		
	}
}

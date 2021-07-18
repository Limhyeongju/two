package pk6;

public class BookArray01 {

	public static void main(String[] args) {
		
		Book xx=new Book();
		
		//main이 간결할수록 서버가 구축이 잘된거다 
		//main에서 는 필요한거만 골라쓰기에 메인코딩이 간결해진다
		//서버를 구축할떄  한번에 구축을 잘하는게 중요하다.
		Book[] abc=new Book[5];
		
		for(int i=0; i<abc.length; i++) {
			System.out.println(abc[i]);
		}

	}

}

package pk5;

public class SwitchCase03 {

	public static void main(String[] args) {
		
		String medal="gold";
		//초기값은 문자, 숫자 가능하다
		
		switch(medal) {
		case "gold": //케이스도 문자"", 숫자() 가능
			System.out.println("금메달입니다.");
			break;
			
		case "sliver":
				System.out.println("금메달입니다.");
				break;
				
		case "bronze":
					System.out.println("금메달입니다.");
					break;
		default :System.out.println("메달이 없습니다.");
		//초기화 값이 있어도 default를 주어도 된다.
						
		}//switcg

				
	}//main

}//class

package pk5;

import java.util.Scanner;

public class Resurt {

	public static void main(String[] args) {
		//로그인 형태
		
		Scanner scan=new Scanner(System.in);
		// Scanner ctrl+스페이스 java util을 불러와야 한다. 
		// 스캐너에 컨트롤 스테이스로 수동끌어오기
		
		System.out.print("아이디: ");
		String ID=scan.nextLine();//smile
		//스캔에서 Strin을 받아서  입력 받아 쓰는것
		//	String 땡떙=scan.nextLine(); 떙떙: 변수이름
		System.out.print("비밀번호: ");
		String PW=scan.nextLine();
		
		// 비번 형변환 (string -> int) 숫자로만 받는다
		int pass= Integer.parseInt(PW); 
		//class 변환은 class에서 변환해줘야한다
		//string 변환은  Integer.parseInt
		// 클래스는 클래스에서 끌어온다

		if (ID.equals("smile")) {// 내가 입력한 거랑 데이터베이스랑 같냐
			//.equals를 사용하여 같냐고 물어본다. 외워서 써야한다.
			// ID 입력했을떄 매서드가 딸려오는 이유는 String 클래스를 받아와서이다.
			if(pass ==12345) { //이중 if사용 //아이디 비번 둘다 맞는경우
				System.out.println("로그인 성공");
			}else {// 아이디만 맞는 경우
				System.out.println("로그인 실패: 비밀번호가 다릅니다.");
			}
		}else { // 아이디와 비번 둘다 틀릴경우 위의 조건 무시 및 아래 출력
			System.out.println("로그인 실패: 존재하지 않는 아이디입니다.");
		}
			
			// ID. PW., 매서스가 따라오는 이유는 스트링 클래스 라서 
			//인스턴스 변수 안에 내용을 받을수있는변수
		//데이터베이스랑 연동은 지금은 안되있다.
	
	}

}

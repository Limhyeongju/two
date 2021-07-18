package pk5;

public class SwitchCase07 {

	public static void main(String[] args) {
		
		int time=(int)(Math.random()*4)+9; //기본은 이기에 double-> int로 형변환
		//9부터 시작해서 숫자 4개
		System.out.println("현재시간: "+time+ "시"); //[현재시간 9시]

		switch(time) {
		case 9:
			System.out.println("출근합니다");
			break;
		case 10:
			System.out.println("커피타임입니다");
			break;
		case 11:
			System.out.println("점심시간입니다");
			break;
		default:
			System.out.println("칼퇴하세요");
		
		}
		
	}

}

package pk5;

public class SwitchCase06 {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;
		//0을 가져오는 걸 막기 위해 1을 준다
		//1부터 시작해서 숫자 6개
		switch(num) {
		case 1: //case는 이름이 겹칠경우 에러
			System.out.println("1번획득");
			break;
		case 2:
		System.out.println("2번획득");
		break;
		case 3:
			System.out.println("3번획득");
			break;
		case 4:
			System.out.println("4번획득");
			break;
		case 5:
			System.out.println("5번획득");
			break;
		default :
			System.out.println("6번 꽝");
			
		}
		System.out.println(num+"입니다.");
	}

}

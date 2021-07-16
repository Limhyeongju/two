package pk3;

public class Constant {

	public static void main(String[] args) {
		// 상수 : 변하지 않는 값 선언
		final int Max_Num=100;
		final int Min_Num;
		final double pi=3.14;
		Min_Num=0;
		
		System.out.println(Max_Num);
		System.out.println(Min_Num);
		System.out.println(pi);
		
		//MAX_NUM=1000; //Error: 상수값, 즉 한번 설정하면 변하지 않는 선언, 변경불가
		//pi=3.14; // PISMS 위에 3.14로 정했기때문에 PI는 에러가뜨는게 맞다
	}
	
}


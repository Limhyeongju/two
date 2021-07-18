package chapter04;

public class Example01 {

	public static void main(String[] args) {
		//*과수원이 있다.
				//배, 사과 , 오렌지를 키우고 있는데 하루에 생산되는 양은 각각
				//각각 5,7,5개 이다. 
				//과수원에서 하루에 생산되는 총개수를 출력하고 , 시간당 전체 과일의 평균 갯수를 출력
				//단, 평균값을 담는 변수는 float으로 지정할것
		int a=5;
		int b=7;
		int c=5;
		
		 int total=a+b+c;
		 System.out.println("하루 총생산량"+total);
		 float aver=total/24f;
		 System.out.println("하루 평균시간생산량 "+aver);
		// e 식에 24에 f가 빠져 소수가 나오지 않았다 난 24;로 품
//float은 끝에 식에 f를 붙여 표현해준다
	}

}

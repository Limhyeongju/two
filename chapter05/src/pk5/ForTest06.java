package pk5;

public class ForTest06 {

	public static void main(String[] args) {
		//continue
		//1~100 까지 홀수만 더한값
		
		int total=0;
		int num;
		
		for(num=0;num<=100;num++) {
			//짝수 제외하고 더하기
			
		if(num % 2==0)
		// 그냥  가세요, 무시하고 진행
				continue;//if 문이 true 일때 실행
		
			total+=num;
				
		}
		System.out.println("1부터 100까지의 홀수의 합: "+total + "입니다");
	}

}

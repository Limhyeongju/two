package pk5;

public class DoWhile01 {

	public static void main(String[] args) {
		
		int num=1;//인덱스 변수 초기화 
		int sum=0;
		
		do { //do~ while문의 시작 
			sum += num;//1 값을 증가
			num++;//2 //인덱스변수 증가
		}while(num<=10); //do ~ while문 조건 비교하여 끝
		
		//do ~ while문 종료후 수행
		System.out.println("1부터 10까지의합:"+ sum+"입니다.");
	}

}

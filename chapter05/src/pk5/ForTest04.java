package pk5;

public class ForTest04 {

	public static void main(String[] args) {
		//0부터 출발해서 100까지 합
		int i;
		int sum=0;
		//숫자는 0부터 시작함을 인지하고 있어야한다
		// 초기값을 준다. 
		
		for(i=1;i<=100;i++) {
			sum=sum+i;
			//System.out.println("1부터 100까지의 합은"+ sum+ "입니다");
		// 여기에 syso를 넣으면작업돌아간수가 다나온다 여기서는 100번 작업한게 나온다
		
		}
		System.out.println("1부터 100까지의 합은"+ sum+ "입니다");

	}
	}

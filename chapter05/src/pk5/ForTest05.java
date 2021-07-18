package pk5;

public class ForTest05 {

	public static void main(String[] args) {
		//1부터 100의 합을 구하되 합이 100에 가까우면서 가장큰수
		
		/*int num=0;
		int sum=0;
	 for( num=0; sum<100; num++) {
		sum=sum+num;*/
		//sum+=num;으로 줄일수 있다
		
		int num=0;
		int sum=0;;
		 for(num=0;; num++){
		 sum+= num;
		  if(sum>100)
		  	break ; //100을 초과하면 멈춤 //
		
		
	}
	System.out.println("num:"+ num);
	System.out.println("sum:"+ sum);
}

	}

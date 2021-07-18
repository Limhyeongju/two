package pk5;

public class ForTest07 {
	
	public static void main(String[] args) {
		//이중포문 수레바퀴 2개마냥 안에도 포문이 있음  밖에도 있음
		//안의 포문이 1바퀴 볼떄 바깥포문은 1칸 이동
		// 수레바퀴 밖의 큰거는 안의 수레바퀴가 한바퀴돌릴떄 이동
		
	int i,j;
	 for(i=1;i<=5;i++) {
		for(j=1;j<=i;j++) {
			
			System.out.println(j+" ");
			
		}// 안쪽 for
		
		System.out.println("==========");
	 }// 바깥쪽의 for
}//main
	}//class
package pk6;

public class ArraySum03 {

	public static void main(String[] args) {
		int[] score;//= {83,90,87};
		 //add(score);
		int sum2=add(new int[] {83,90,87});
		System.out.println(" 총합  :"+sum2);
		System.out.println();
		/*
		 * int sum=0;
		for(int i=0; i<score.length;i++) {
			sum+=score[i];
			}
		System.out.println("총합 :"+sum); 
		*/
		
		
		//매서드 =함수
		// 함수로 만드는것
		//매개 변수 : 메소드 컴파일시 사용되는 변수 
	}//메인
		public static int add(int[] score) {
			//static 기준이 되는 중심값
			int sum=0;
			for(int i=0; i<score.length;i++ ) {
				sum+=score[i];
			}
			return sum;
		}		// 매서드
}//class

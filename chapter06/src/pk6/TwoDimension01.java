package pk6;

public class TwoDimension01 {
	public static void main(String[] args) {
		
		
		int[][] arr= {{1,2,3},{4,5,6}};
		//				0,      1 큰거로 봤을때
		//이중 for문
		
		System.out.println(arr.length); // 전체행 몇개 가지고 있나
		System.out.println(arr[0].length); //0행의 열, 0행의 첨자(원소)가 몇개 인가
		System.out.println(arr[1].length); //1행의 열
		
		System.out.println("================");
		for(int i=0; i<arr.length;i++) { //i행 j열 
			// i ->2번돌고
			for(int j=0; j<arr[i].length; j++) {
				//j-> 3번돌고
				System.out.print(arr[i] [j]+ " ");
		}
	
	System.out.println();
	}
}
}

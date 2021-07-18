package pk6;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		int[][] arr= new int[2][3];
		//2행 3열로 초기화
		
		int n=0;
		for(int i=0; i<arr.length; i++) {
			//전체행을 돌아라
			for(int j=0; j<arr[i].length; j++) {
				n++;
				System.out.print(n+"\t"); 
				//\t 는 탭누른만큼 한칸뛰고 한줄띄고 역슬래시 탭 
			}
			System.out.println();
		}

	}

}

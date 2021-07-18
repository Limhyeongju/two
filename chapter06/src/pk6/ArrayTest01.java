 package pk6;

public class ArrayTest01 {

	public static void main(String[] args) {
		/* 배열선언
		 1줄로 선언하는법
		 int[] number1= new int[10];
		 int number2[]= new int[10];
		  
		 두줄로
		 int numbe3[];
		 number3[]=new int[10]; 이 변수 방의 메모리는 첨자 10만큼 쓴다
		
		 */
		
		// 배열의 변수값을 넣어서 초기화 하는법
		/*int[] number1=new int[] {1,2,3,4,5,6,7,8,9,10};
		// 안의 값을 이렇게 초기화한다
		//int[] number1=new int[10] {1,2,3,4,5,6,7,8,9,10}; 이렇게 적용하면 오류발생
		  											{1~10} 이것도 오류
		int number3[]= {1,2,3,4,5,6,7,8,9,10};//  이건 초기화 가능하다
		int[] number4= {1,2,3,4,5,6,7,8,9,10};//  이건 초기화 가능하다 
		*/
		
		int[] number=new int[] {1,2,3,4,5,6,7,8,9,10}; 
		//{ } 안의 수 첨자, 원소 라 한다
		//number[0] number: 이름 0:첨자수
		int len=number.length; //length 배열의 길이 
		//System.out.println(len);  /10
		
		for(int i=0; i<len;i++) {
			System.out.println(number[i]);


		}
		
		

	}

}

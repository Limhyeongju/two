package pk7;
//재귀함수 자기자신을 호출해서 쓰는 함수 자기자신을 조건을 만족할때까지 돌린다
public class FunTest07 {
	
	public static int Recur(int a) { //3*2*1
		
		int gophagi;
		System.out.println(a); // 3 2 1
		if(a==1)
		return (1);//return (1) 정상종료지만 실제로 값을 넘겨주진 않는다
						//= break의 역할을 한다
		else gophagi=a*Recur(a-1);// 3*2*1 =6 ,2*1=2 // Recur 함수 사용
		
		return (gophagi); 
		}
	
		//return 0; //정상리턴

	public static void main(String[] args) {
		int res, x=5;
		
		System.out.println("여기는 main() 입니다");
		System.out.println("메소드를 호출합니다");
		res= Recur(x); //재귀함수로 구현하시오
		
		System.out.println("1 ~3 까지의 수를 곱한 값 : "+res+"\n");
		System.out.println("main()으로 다시 돌아왔습니다.");
	}

}

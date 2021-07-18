package pk6;

public class AgrsTest01 {

	public static void main(String[] args) {
		/*public 이란 아무데서나 사용할수 있다.(모든사람 이용가능)
		   static 고정시켜 놓는다는 개념
		   main은 컴파일을 거쳐서 실행프로그램을 만든다.
		   String[] 배열 쓰려면 쓰려고 선언해준것
		   int a[]= new int[5]; a o o o o o a의 몇번쨰방
		   a=new int[5]
		   String[] args 선언만 했을뿐 값이 없다
		   코드없이 사용하는 Run -> Run configuration에서 
		   들어가서 클래스 선택후 agruments 사용하면 배열값을 바로 입력해줄수 있다.
		 */
		
		int aval;
		int bval;
		int tot;
		
		//쓰고 있는 배열의 길이는 얼마냐
		/*
		args=new String[2]; args초기화 방법은 값을 준다
		args[0]="1";
		args[1]="1"; 
		*/
		
		if(args.length==2) {
			aval=Integer.parseInt(args[0]);
			//자료형변환 String->int Integer.parseInt
			bval=Integer.parseInt(args[1]);
			//aval=args[0];
			//bval=args[1];
			// 지금 에러가 나는이유 자료형 int가 쓰여서이다.
			//String =>int 로 형변화가 필요하다
		}// true
		//run conpigurations을 사용안할 경우 위의 손코딩이 필요하다
		else {
			aval=0;
			bval=0;
			}//false
		tot=aval+bval;
		System.out.println(tot);
	}

}

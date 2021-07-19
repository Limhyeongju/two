package pk10;

import javax.swing.JOptionPane;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		/*StaticFunction ga= new StaticFunction(); 
		 * 일반적인 객체선언후 사용  (객체선언 =>heap메모리)
		System.out.println(ga.str2); */ //메모리가 틀리니 개념상 맞지 않다
		
		//static은 공용 중심이 되는 값이니  같은곳을 바라보고 있으니 class로 묶어보자
		//공통으로 바라보니 아예 묶음처리해서 class로 불러온다 
		//static으로 사용할수 있는것이 다 나온다.
		//static 메서드는 클래스명. 메서드로 접근이 적합하다
		String str;
		str=StaticFunction.getStatic();
		
		System.out.println("str = "+ str);
		
		
	}

}

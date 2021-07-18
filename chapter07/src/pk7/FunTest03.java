package pk7;

import javax.swing.JOptionPane;

public class FunTest03 {
	//void는 return값을 가질수 없다.
	public  void sum(int a,int b) {
		System.out.println(a+ "+" +b +"="+(a+b));
	}

	public static void main(String[] args) {
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		//sum(num1,num2);// Error나는 경우 static에서 void를 사용못한다
						//위의 매서드에서 public void로 사용하면
						//void는 리턴이 안된다 static은 데이터 메모리중 가장 위의 영역이다
						//void는 스텍의 영역
						//static에서 호출되지 않았으므로 컴파일 할수없음
			// 값에 의한 호출 call by value
		FunTest03 Obj=new FunTest03(); //객체를 만들어 강제로 호출한다. 중요!!!
		Obj.sum(num1, num2);
	}

}

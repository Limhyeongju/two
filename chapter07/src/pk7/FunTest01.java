package pk7;
//1~7기본개념 펑션
import javax.swing.JOptionPane;

public class FunTest01 {

	public static void sum(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}//메서드// 위치는 자바에서는 상관없다.
	
	public static void main(String[] args) {
		
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값")); //2
		num2=Integer.parseInt(JOptionPane.showInputDialog("값")); //5
		sum(num1, num2);

	}

}

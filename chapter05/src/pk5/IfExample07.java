package pk5;

import javax.swing.JOptionPane;

public class IfExample07 {

	public static void main(String[] args) {
		// double num1=(Math.ramdon()*^); 실수인 숫자가 랜덤으로 
		//ifexample06 내용
		
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
				
		//num1이 num2보다 크면 num1이 더 큽니다
		//num2이 num1보다 크면 num2가 더 큽니다
		// 두 값이 같습니다
		
		if (num1>num2) {System.out.println(num1+"이 더 큽니다.");
		} else if(num2>num1) {System.out.println(num2+"가 더 큽니다.");
		} else {System.out.println("두 값이 같습니다");}
		
		
		
	}

}

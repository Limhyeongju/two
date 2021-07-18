package pk5;

import javax.swing.JOptionPane;

public class ifExample_02 {

	public static void main(String[] args) {
		// 10의 배수 판별
		
		int d;
		d=Integer.parseInt(JOptionPane.showInputDialog("값입력"));
		
		if(d%10==0) {
			System.out.println(d+"은"+ "10의 배수입니다.");
		}else  {System.out.println(d+"는(은)"+"10의 배수가 아닙니다.");
		}
	}

}

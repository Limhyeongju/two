package pk5;

import javax.swing.JOptionPane;
// do ~while : 무조건 한번 실행하고 반복 시작됨
public class DoWhile02 {

	public static void main(String[] args) {
		
		int n1, n2;
		
		do {
			n1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
			//값이 들어와야할때 박스로 입력, 이건 외워야한다
					n2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
					if(n1==n2) {
						System.out.println("same!!");
						break;
					}
					System.out.println("different!!");
		}while(n1!=n2);
	}

}

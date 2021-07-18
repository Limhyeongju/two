package pk9;

import javax.swing.JOptionPane;

public class ThisTestmain {
	//기본생성자, this,메서드 활용 법을 다알아야 적용할수있다.

	public static void main(String[] args) {
		
		//기본 생성자로 객체를 만들되 .객체의 이름은 R1 (move 2번 ,RAge)
		ThisTest R1= new ThisTest();
			
		R1.Move();
		R1.Move();
		R1.RAge();
		
		
		
		
		
		System.out.println("=====객체2=======");
		//swing으로 입력을 받아서 로봇의 속도와 나이, 이름, 로봇번호를 출력
		//ThisTest의 모든 메서드 사용
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("로봇속도"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("로봇나이"));
		String c=JOptionPane.showInputDialog("로봇이름");
		String d=JOptionPane.showInputDialog("로봇번호");
		
		ThisTest R2 = new ThisTest(a,b,c,d);
		
		System.out.println("속도 : "+a);
		System.out.println("나이 : "+b);
		System.out.println("이름 : "+c);
		System.out.println("번호 : "+d);
		
		R2.Move();
		R2.RAge();
		R2.Rname();
		R2.Rnum();
		System.out.println();
	
		/*if를 활용한 아이디어
		while(true) {
		String str = JOptionPane.showInputDialog("입력");
		outer;
		if (str.equals("움직여")) {
			R1.Move();
			break outer;
		} else if (str.equals("멈춰")) {
			R1.Stop();
			break outer;
		} else if (str.equals("나이")) {
			R1.RAge();
			break outer;
		} else if (str.equals("이름")) {
			R1.RName();
			break outer;
		} else if (str.equals("로봇번호")) {
			R1.RNum();
			break outer;
		} else {
			JOptionPane.showMessageDialog(null, "틀린문자");
			break outer;
			}
			}
		*/
	}

}

package pk10;

import javax.swing.JOptionPane;

public class FinalTest { //이건 진짜 건드리지 말아야겠따 할때 사용
	
	private static final int MAX=3; //일반변수와 구분하기위해 대부분 대문자 사용
									// 고정된 된 상수값을 
	public static void main(String[] args) {
		
		int num=10;
		for(int i=0;i<MAX;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog(" 값입력 "));
			if(num>MAX)
				System.out.println("입력값이 3보다 큽니다");
			else
				System.out.println("입력값이 3보다 크지 않습니다.");
		}
		// 런 옆의 벌레버튼 디버깅 요페이지가 어디랑 맞물려있는지 오류를 어떻게 빨리 찾아내는지,
		//구글싱을 어떻게 잘 사용하는지 , 나중에 객체가 많아 지면 찾기가 어렵다
	}

}

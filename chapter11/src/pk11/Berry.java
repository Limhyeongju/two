package pk11;

import javax.swing.JOptionPane;

public class Berry extends Fruit { //Fruit을 상속 받는다 눈에는 안보이지만
								   //Fruit의 정보가 들어있다.
	
	private String size;
	private String name;
	
	/*public void Set1(String a, String b) {
		a=JOptionPane.showInputDialog("값");
		System.out.println(b);
	}*/ // 이부분이 오버라이딩
	
	public void Set2(String a, String b) {
		name=a;
		size=b;
	}
	public void Disp2() {
		System.out.println("이름 : "+name);
		System.out.println("크기 : "+size);
		
	}

}

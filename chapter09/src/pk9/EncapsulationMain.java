package pk9;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		int side;
		int height;
		int Area;
		String str="";
		
		Encapsulation a= new Encapsulation();
		int n=Integer.parseInt(JOptionPane.showInputDialog("가로 n"));
		int h=Integer.parseInt(JOptionPane.showInputDialog("세로 h"));
		a.Cal_Area(n, h);// 딱보고 이건 보이드가 아니겠구나를 알아야한다
		Area=n*h;
		System.out.println("사각형의 넓이는");
		System.out.println(a.Cal_Area(n, h)+" 입니다");
		JOptionPane.showInternalMessageDialog(null, "사각형의 넓이는"+ Area + "입니다");
		// null쓰는 이유팝업창 나오는거 프레임 바꾸는 역할인데
		//null쓰면 기본형쓴다고 나와있네요
	}

}

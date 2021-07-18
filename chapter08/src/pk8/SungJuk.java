package pk8;

import javax.swing.JOptionPane;

public class SungJuk {
	//멤버 변수 = 필드
	private String std_num;
	private String std_name;
	private int java, python, bigdata;
	
	//생성자 묵시적은 콘솔이 들어 있다.
	
	
	//매서드
	public void sum() {
		System.out.println("합계 : "+(java + python + bigdata));
	}
	public void avg() {
		System.out.println("평균 : "+(java + python + bigdata)/3);
	}
		

	
	public static void main(String[] args) {
		//res 객체
	
		
		SungJuk rec= new SungJuk();
		rec.std_num=JOptionPane.showInputDialog("학번");
		rec.std_name=JOptionPane.showInputDialog("성명");
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("java 성적"));
		rec.python=Integer.parseInt(JOptionPane.showInputDialog("pthon 성적"));
		rec.bigdata=Integer.parseInt(JOptionPane.showInputDialog("bigdata 성적"));
		
		
		System.out.println(rec.std_num + "학번, "+rec.std_name + "의 성적입니다.");
		rec.sum();
		rec.avg();
		
	}

}

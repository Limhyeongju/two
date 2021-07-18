package pk5;

import javax.swing.JOptionPane;

public class ifExample_03 {

	public static void main(String[] args) {
		// 점수가 90이상이면 수, 80이상이면 우, 70이상이면 미, 60이상이면 양, 나머지 가
		
		char score;
		int g;
		g=Integer.parseInt(JOptionPane.showInputDialog("score"));
		if(g>=90) {// 수행문
			System.out.println("점수는"+g+"는(은)"+ "수");
		}else if(g>=80) {
			System.out.println(g+"는(은)"+ "우");
		}else if(g>=70) {
			System.out.println(g+"는(은)"+ "미");
		}else if(g>=60) {
			System.out.println(g+"는(은)"+ "양");
		}else if(g>=50) {
			System.out.println(g+"는(은)"+ "가");
			//중괄호 는 조건다음 수행문이 한줄일때 생략 가능
		}
		
	}

}

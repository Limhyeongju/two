package pk5;

import javax.swing.JOptionPane;

public class ifExample_04 {

	public static void main(String[] args) {
		//9살미만 미취학아동 이라하고  요금은 1000원
		//14살미만 초등 이라하고  요금은 1000원
		//17살미만 중등 이라하고  요금은 1000원
		//20살미만 성인 이라하고  요금은 2000원
		
		
		int age;
		int charge;
		age=Integer.parseInt(JOptionPane.showInputDialog(""));
				if(age<9) {
					charge=1000;
					System.out.println("미취학 아동");
				}else if(age<14) {//14살미만 초등학생 이라하고  요금은 2000원
					charge=2000;
					System.out.println("초등학생");
				}else if(age<17) {
					charge=3000;
					System.out.println("중학생");
				}else if(age<20) {
					charge=4000;
					System.out.println("고등학생");
				}else {//나머지는 성인이라하고  요금은 5000원
					charge=5000;
					System.out.println("성인");
				}
				System.out.println("요금은"+charge+"원 입니다.");
				}
		
	

}

package pk8;

public class Vending {
	//멤버변수
	private Can can[]=new Can[5];//can[] 배열자체를 객체로 만든다
	private int money;
	
	//생성자 생략
	
	//초기화 메서드  init() 통상적으로 쓰인다
	public void init() {
		can[0]=new Can("환타", 1000);
		can[1]=new Can("사이다", 1200);
		can[2]=new Can("오렌지", 800);
		can[3]=new Can("콜라", 1100);
		can[4]=new Can("제로콜라", 900);
	}
	public void showCans(int m) {
		money=m;
	
		//for 문을 이용 내가 갖고 있는돈과 getprice와 비교
		
		for(int i=0; i<can.length; i++) { //사용자의 돈으로 살수있는 음료만 보여주기
			if(can[i].getPrice()<=money)
			System.out.println(can[i].getCanName()+ " - "+can[i].getPrice()+ "원");
			
		}
	}	
		//선택한 음료제공 후 잔액 계산해서 주는 메서드
		public void  outCan(String name) {
			
			for(int i=0; i<can.length;i++) {
				
				if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName()+ "를(을) 선택하셨습니다.");
				System.out.println("잔액 : "+(money-can[i].getPrice())+" 원입니다.");
				}
			}
			
		}
	}



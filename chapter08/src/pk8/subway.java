package pk8;

public class subway {
	 
	public String linenumber;// 자하철 노선
	public int passengercount;//승객수
	public  int money;// 수입액
	
	public subway(String linenumeber) {
		this.linenumber=linenumeber;
		
	}
	
	public void take (int money) { //승객이 탄경우
		this.money+=money;// 수입증가
		passengercount++;// 승객수증가
	}
	public void subwayinfo () {
		System.out.println("지하철 "+linenumber+"번의 승객은 "+passengercount+ "명이고 "
				+"수입은 "+money+ "원입니다");
	}
	
	
}

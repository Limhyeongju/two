package pk11;

public class CustomerVip extends Customer{

	
	//전문 상담원 agentID(정수)
	//10프로 세일 saleratio 예)0,1
	//보너스포인트
	private int agentID;
	double saleratio;
	
	//생성자 이용 (고객의 아이디, 이름 , 상담원 아이디)
	//생성자 이용(등급 =vip,bonusratio=0.05. saleratio,
	public CustomerVip(int customerID,String customername, int agentID) {
		super(customerID, customername);
		this.agentID=agentID;
		
		customergrade="VIP";
		bonusratio=0.05;
		saleratio=0.1;
		
	}
	//calcprice=> overriding
	//return 5000-(5000*0.1) saleratiog 활용
	@Override
	public int calcprice(int price) {
		bonuspoint+=bonusratio*price;
		return super.calcprice(price)-(int)(price*saleratio);
	
	
	}
	//showCustomerInfo()=> Overriding
	@Override
	public String showCstomerInfo() {
		//부모 클래스이 메서드를 사용하고 상담원 아이디 추가
		return super.showCstomerInfo()+"담당 상담원 번호는 "+agentID+ "입니다";
	

	}
	//상담원 아이디
	public int getAgentID( ) {
		return agentID;
	}
}

package pk11;

public class CustomerTest {

	public static void main(String[] args) {
		
		//일반고객 정보 (Customer)
		System.out.println("일반고객============");
		Customer customerlee=new Customer(); //고객등급 포인트적용률
		
		customerlee.setCustomername("이호진");
		
		int price= 10000;
		int leeprice=customerlee.calcprice(price); //호출한곳에서 가격을 다시준다
										// 보너스포인트가 쌓여 다시 가격을 보내준다
		System.out.println(customerlee.showCstomerInfo());	
		System.out.println(customerlee.getCustomername()+"님이 "+leeprice+"원을 지불했습니다");
		System.out.println("--------------------------------------");
		
		
		System.out.println("Vip고객===============");
		CustomerVip viplee=new CustomerVip(1001,"부자",5454);
		int price2=100000000;
		int vipleeprice= viplee.calcprice(price2);
		System.out.println(viplee.showCstomerInfo());
		System.out.println(viplee.getCustomername()+"님이 "+vipleeprice+"원을 지불했습니다");
		
		
		
	}

}

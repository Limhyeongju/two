package pk11;

public class VegetablePaprika extends Vegetable {
	
	private String color;
	private int price;
	private String name;
	
	
	
	//set
	public void set3(String a, int b, String c) {
		
		color=a;
		price=b;
		name=c;//  c=name; 반대로하면 초기값이 없기에 출력하면 다 null이 나온다 
		
	}
	
	public void Disp2() {
		System.out.println("색깔 : "+color);
		System.out.println("가격 : "+price);
		System.out.println("이름 : "+super.name); //super는 부모객체거를 읽는다 
	}
	//get Disp3
	public void Disp3() {
		System.out.println("색깔 : "+color);
		System.out.println("가격 : "+price);
		System.out.println("이름 : "+name);
		
		
	}
}

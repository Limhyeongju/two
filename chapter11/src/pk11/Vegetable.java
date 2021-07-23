package pk11;

public class Vegetable {
	
	String sort;
	String season;
	String name;
	
	//기본생성자 슈퍼
	
	//메서드를 활용하여 멤버변수 set
	public void set1(String a, String b, String c) { // 그대로 써서 this로 불러와도 된다
		sort=a;
		season=b;
		name=c;
	}
	public void Disp1() {
		System.out.println("분류 : "+sort);
		System.out.println("계절 : "+season);
		System.out.println("이름 : "+name);
		}

}

package pk8;

public class Can {
	//멤버변수 =필드=속성
	private String canName; // 음료이름 //가져다 쓰려면 겟셋을 이용해야한다.
	private int price; // 음료가격

	//생성자
	public Can(String canName, int price) { 
		this.canName=canName;
		this.price=price;
	
	}

	public String getCanName() {
		return canName;
	}

	public void setCanName(String canName) {
		this.canName = canName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

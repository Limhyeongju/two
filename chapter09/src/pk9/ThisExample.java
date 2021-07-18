package pk9;

public class ThisExample {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year=year;
	}
	public void printThis() {
		 System.out.println(this);
	}
	
	
	
	public static void main(String[] args) {
	
		
		ThisExample bday= new ThisExample();
		
		bday.setYear(2000);
		System.out.println(bday.year);
		System.out.println("=======================");
		System.out.println(bday);//나자신 을 출력하랏
		System.out.println("=======================");
		bday.printThis();// 나자신 this 내가 갖고있는 변수방
		
	}

}

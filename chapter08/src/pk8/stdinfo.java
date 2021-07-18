package pk8;

public class stdinfo {
	public String studentname;
	public int grade;
	public int money;
	
	//생성자 (오버로딩) studentname 과 money는 갖고 태어남
	public stdinfo(String studentname ,int money ) {
		this.studentname=studentname;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);// bus클래스에 있는take
		this.money-=1000;
	}
	public void takesubway(subway subway) {
		subway.take(1500);// subway클래스에 있는take
		this.money-=1500;
	}
	
	public void showinfo() {
		System.out.println(studentname+ "님의 남은 돈은 :"+money+ " 입니다.");
		
	}
	
}

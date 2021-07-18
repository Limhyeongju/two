package pk9;

public class ThisTest {
	
	private int Speed;
	private int Age;
	private String robotname;
	private String robotnum;
	
	//기본 생성자
	public ThisTest () {
		this(10,3,"Bab","20210608");
	}
	public ThisTest(int Speed, int Age, String robotname, String robotnum) {
		this.Speed=Speed;
		this.Age=Age;
		this.robotname=robotname;
		this.robotnum=robotnum;
	}
	
	public void Move() {
		Speed+=20;
		System.out.println("RobotSpeed : "+Speed);
	}
	public void stop() {
		Speed=0;
		System.out.println("RobotSpeed : "+Speed);
	}
	public void RAge() {
		Age +=0;
		System.out.println("RobotAge : "+Age);
	}
	public void Rname() {
		System.out.println("RobotAge : "+robotname);
	}
	public void Rnum() {
		System.out.println("RobotAge : "+robotnum);
	}
	
	
}

package pk10;

public class Student2 {
	
	public static int serialnum=1000;
	int studentID;
	String studentname;
	int grade;
	String address;
	// 네임 넘버 겟셋
	//넘버 겟셋 하는 이유
	
	//생성자를 활용하여 넘버를 달고 오진 않지만 serialnum를 하나씩 증가하는 구현
	public Student2( ) {
		serialnum++;
		this.studentID=serialnum;
	}
	
	
	
	public static int getSerialnum() {
		return serialnum;
	}
	public static void setSerialnum(int serialnum) {
		Student2.serialnum = serialnum;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

}

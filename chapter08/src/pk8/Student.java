package pk8;

public class Student {
	
	//필드 멤버 변수
	int studentID;
	String studentname;
	int grade;
	String address;
	
	//생성자(기본생성자): free compile
	
	//메서드
	public void showStudentInfo() {
		System.out.println(studentname + ", "+ address);
		
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

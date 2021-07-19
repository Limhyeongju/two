package pk10;

public class Student1 {
	
	public static int serialnum=1000;
	int studentID;
	String studentname;
	int grade;
	String address;
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	//studentname만 겟셋 나머진 바깥에서 받는다.
	public static int getsrialnum( ) {
		int i=10;
		return serialnum;
	}

}

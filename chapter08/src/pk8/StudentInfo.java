package pk8;

public class StudentInfo {
	
	int studentID;
	private String studentname;
	int grade;
	String address;
	
	
	public String getStudentname() {//소스에서 겟터엔 세터 주고받을거 선택하고 제너레잍
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	

}

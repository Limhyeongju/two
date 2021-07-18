package pk8;

public class StudentInfomain {

	public static void main(String[] args) {

		StudentInfo ex= new StudentInfo();
		
		ex.setStudentname("점심 맛있게드세요2"); //studentname이 private 라 set으로 부
											// 불러서 사용
		System.out.println(ex.getStudentname());
		//studentname이 private 라 get으로 가져와서
		// 불러서 사용

	}

}

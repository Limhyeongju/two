package pk8;

public class Studentmain {
	public static void main(String[] args) {
		Student ex= new Student();
		System.out.println("============필드 이용=======");
		//필드를 사용하여 이름과 주소 출력
		//System.out.println("임씨");
		//System.out.println("서울특별시 성북구");
		ex.studentname="임씨";
		ex.address="서울특별시 성북구";
		System.out.println(ex.studentname+"\n" +ex.address);
		
		System.out.println("============메서드이용=======");
		//메서드를 사용하여 이름과 주소 출력
		Student ex2= new Student();
		ex2.setStudentname("임씨");
		System.out.println(ex2.getStudentname());
		ex2.setAddress("서울특별시 성북구");
		System.out.println(ex2.getAddress());
		
		
		
		
	}


}

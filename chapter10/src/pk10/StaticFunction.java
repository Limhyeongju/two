package pk10;

public class StaticFunction {
	
	String str1= "일반 멤버변수 ";
	static String str2= "static 멤버변수 ";
	
	public static String getStatic() {
		
		//return str1; erroe static 내부에서는 static변수만 사용가능 
		//일반변수라 안된다 메모리가 달라 사용불가
		return str2;
		
		
	}
	
	
}

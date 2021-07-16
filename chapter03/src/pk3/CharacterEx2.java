package pk3;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		//int= a=65;// 대문자A
		int a=97; //소문자a
		System.out.println(a);
		System.out.println((char)a); //형변환(ASCII코드)
		
		System.out.println("========");
		//int와char는 호환이 가능하지만 음수는 호환되지 않는다
		
		int b=-66;
		System.out.println(b);
		System.out.println((char)b);
		System.out.println("========");
	
		char a2=65;//ASCII코드, 아스키코드는 음수가 표현되지 않는다
		// char b2=-66// Error
		System.out.println(a2);
		System.out.println((int)a2);
		
	}

}

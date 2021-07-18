package pk6;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		
		String[] strarray= { "java","python","android","c","javascri"};
		/*
		for(int i=0;i<strarray.length;i++) {
			System.out.println(strarray[i]); //행과 열 출력하기 strarray[i] 을strarray로 
			출력하면 주기억장치 메모리 주소(해쉬코드)가 나온다
			
		}*/
		for(String lang : strarray) { //확장포문 EnhancedFor lang 내가 변수를 담을 방 아무렇게나 가능
			System.out.println(lang);
		}
	}
}

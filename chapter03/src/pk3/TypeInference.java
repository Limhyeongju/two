package pk3;

public class TypeInference {

	public static void main(String[] args) {
		
		int i=10;
		var j= 10.0;//double j=10.0;
		var str="hello";//String str="
		
		i=100;
		str= "test";
		
		//str=3; Type Error 초기값이 스트림이 문자이기 
		//때문에 문자만 쓸거다 (한번선언된 typed은 변경안됨)
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
	}

}

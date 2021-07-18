package pk6;

public class CharArryTest02 {

	public static void main(String[] args) {//1차원배열은 하나의 배열로 되어있는거
		char[] alpahbets= new char[26];
		//알파벳 26개이므로 26첨자가 필요하다
		char ch='A'; //ASCII=65
		//char 아스키코드를 쓰는 명령어
		//ch++; 
		//System.out.println(ch++);
		//System.out.println(ch); //후위 계산법
		
		for(int i=0; i < alpahbets.length; i++,ch++) {
			 alpahbets[i]=ch;
		} 
		for(int i=0; i<alpahbets.length; i++)	{
			System.out.println(alpahbets[i]+","+(int)(alpahbets[i]));
		}

	}

}

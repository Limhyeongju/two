package pk6;

import javax.swing.JOptionPane;

public class CharArryTest01 {

	public static void main(String[] args) {
		
		String str[]= {"ab1111","cd222","ef333","gh444","ij555"};
		//					0    1        2      3       4  = > 첨자 5개
		String res="";
		int i;

		
		for(i=0; i<str.length; i++)
			res= res+str[i]+"\n"; 
		//계속 i만큼 누적
		// Enter : "\n" 출력할때 줄바꿈을 해준다
		//res+=str[i]+"\n"
		{
			System.out.println(res);
		}
		
		JOptionPane.showMessageDialog(null, "배열원소의 값\n"+res);// 콘솔에도 뿌리고 다이얼로그에도 뿌린다
	} //null은 초기값, 아무것도 없으면 뿌릴때 오류

}

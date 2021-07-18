package pk7;

import javax.swing.JOptionPane;

public class FunTest06 {
	
	public static void Disp(String A[]) { //A[]
		String res="";
		for(int i=0; i<A.length; i++) {
			res+=A[i]+"\n";
			
		}// for
			System.out.println(res);
			JOptionPane.showMessageDialog(null,"배열의 원소갑 \n" +res);
			//null= 박스값의  초기화
		
	}//method

	public static void main(String[] args) {
		String str[]= {"ab111","cd222","ef333","gh444","ij555"};
		Disp(str);
	}//main

}//class

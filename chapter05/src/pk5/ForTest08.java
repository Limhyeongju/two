package pk5;

public class ForTest08 {

	public static void main(String[] args) {
		// 안쪽 10 밖쪽 10개
		
		for(int x=1; x<=10;x++) {
			for(int y=1;y<=10;y++) {
				if(4*x+5*y==60) {
					System.out.println("x, y의 값은("+x+","+y+")");
					}//if
				}//for
			}//for
			
	}//main
}//class

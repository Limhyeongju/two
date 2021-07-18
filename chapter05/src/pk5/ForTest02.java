 package pk5;

public class ForTest02 {

	public static void main(String[] args) {
		
		int i;
		System.out.println("1부터 10까지의 수 출력");
		for(i=1;i<=10;i++) //i++ = i= i+1 i+=1
			//++1은 (증가해서 시작하므로 2부터 시작하기에 10번을 못돈다)
		//i는 1 부터 10보다 작거나 같을때까지 수행한다
		//i가 없기에 1을 준다. i로 시작하면 끝까지 i로 진행한다
			//코드식이 간결해지니까 fortest 01보다
			{
			System.out.print(i+"  ");
	}
	}
	
}

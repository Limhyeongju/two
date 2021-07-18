package pk6;

public class ArrayTest04 {

	public static void main(String[] args) {
double[] data= new double[5];
		
		int size=0; 
	
		data[0]=10.0;
		size++;
		data[1]=20.0;
		size++;
		data[2]=30.0;
		size++;
		//딱 여기까지만 출력 하고 싶을때
		//내가 사용한것만큼만 짤라서 출력 여기선 size가 브레이크의 역할이나
		// 사용한것만큼까지 size를 써줘야한다
		for(int i=0; i<size; i++) {
			System.out.println(data[i]);
		}

}
}
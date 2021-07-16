package pk3;

public class ByteVariable {

	public static void main(String[] args) {
		
		byte bs1=-128; //8비트 -123 ~ 127 넘으면 에러(+0 포함)
		byte bs2=127;//127까지만 가능 byte bs2=128dms 초과하기에 안됨
		short s=32767;//16비트 -32768 ~ 32767
		System.out.println(bs1);
		System.out.println(bs2);
		System.out.println(s);
	}
}

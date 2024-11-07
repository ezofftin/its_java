package ex01;

public class ArrayTest01 {
	public static void main(String[] args) {
		// 배열 : 여러개의 값을 가진 것
		// 배열 만들기
		int[] a = {1, 2, 3}; 
		int b[] = {11, 22, 33};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("---------");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println("---------");
		// 30을 출력하시오.
		int[] aa = {10, 20, 30};
		
		System.out.println(aa[2]);
//		System.out.println(aa[3]);// 에러 ArrayIndexOutOfBoundsException
		
		System.out.println(aa); // [I@1eb44e46 메모리상의 주소
	}
}

package ex01;

public class ArrayTest04 {
	public static void main(String[] args) {
		
		// 배열 반복문(for)
		int[] v = {1, 2, 5, 9};
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
		System.out.println(v[3]);
		
		System.out.println("--------");
//		ArrayIndexOutOfBoundsException
//		for(int i=0;i<5;i++) {
//			System.out.println(v[i]);
//		}
		
		// 매번 반복시마다 length를 구해야 함, 
//		for(int i=0;i<v.length;i++) {
//			System.out.println(v[i]);
//		}
		
		int size = v.length; // 한번만 길이를 구함
		
		for(int i=0;i<size;i++) {
			System.out.println(v[i]);
		}
		System.out.println("--------");
		// 1부터 10까지의 합
		int sum = 0;
		for(int j=1; j<11; j++) {
			sum = sum + j;
		}
		System.out.println("sum = " + sum);
		System.out.println("---------");
		sum = 0;
		int[] a = {10, 20, 30, 40}; 
//		sum = sum + a[0];
//		sum = sum + a[1];
//		sum = sum + a[2];
//		sum = sum + a[3];
		// 반복문을 활용해서 배열 a의 요소합을 구하시오.
		size = a.length; 
		for(int i =0; i<size; i++) {
			sum +=a[i]; // sum = sum + a[i]
		}
		
		System.out.println("sum = " + sum);
		// 배열의 마지막 요소값 출력하기
		System.out.println("배열의 마지막 요소값 : " + a[size-1]);		
		
	}
}

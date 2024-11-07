package ex01;

public class ArrayTest03 {
	public static void main(String[] args) {
		
		// 배열 만들기 1
		// 자료형[] 배열명 = {값, 값, ....};
		int[] a = {0, 1, 2, 3};
		
		int len = a.length;
		System.out.println("배열 a의 길이 : "+len);
		
		
		// 배열 만들기 2
		// 자료형[] 배열명 = new 자료형[방갯수]
		int[] b = new int[60];
		
		System.out.println(b.length);
		
		
	}
}

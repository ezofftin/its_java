package ex01;

public class ArrayTest02 {
	public static void main(String[] args) {
		int[] arr2 = {1,2,3};
		
		// 다음 컴파일 에러를 해결하시오.
//		b = {"aa", "bb"};
//		c = {0.3, 0.5};
		
		String[] b = {"aa", "bb"};
		double[] c = {0.3, 0.5};
		
//		num = 100;
//		a = {100, 200, num};
		
		int num = 100;
		int[] a = {100, 200, num};
		
//		String s1 ="", s2="java";
//		aa = {s1, s2};
		
		String s1 ="", s2="java";
		String[] aa = {s1, s2};
		
		// 아래와 같이 출력되도록 ?를 작성하시오.
		// ?
		double[] v1 = {0.2, 0.9};
		int[] v2 = {11, 100, 200};
		String[] v3 = {"h", "", "Hello"};
		
		System.out.println(v1[0]); // 0.2
		System.out.println(v2[1]); // 100
		System.out.println(v3[2]); // Hello
	}
}

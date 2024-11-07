package review;

import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine(); // 한라인을 입력 엔터포함
		char c = str.charAt(2);
		int num = c;
		System.out.println(c);
		System.out.println(num);
		
		System.out.println("---------");
		int n = sc.nextInt(); // 66+Enter --> 66
		char ch = (char)n;
		System.out.println("n = " + n);
		System.out.println("ch = " + ch);
		
		System.out.println("---------");
		sc.nextLine(); // 위의 Enter 키값을 처리
		str = sc.nextLine();
		System.out.println("str = " + str);
		
		System.out.println("---------");
		str = sc.next(); // 한단어만 입력
		System.out.println("str = " + str);
		
	}
}

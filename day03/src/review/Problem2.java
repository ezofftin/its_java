package review;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		// 두변수의 값을 바꾸기
		int x = 22;
		int y = 33;
		
//		x = y;
//		y = x;
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("--------------");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if(num !=0) {
				System.out.println(num);
			}else {
				System.out.println("bye bye~~");
				break;
			}
		}
		
	}
}

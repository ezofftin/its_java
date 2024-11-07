package review;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		System.out.println("---------- Menu -----------");
		System.out.println("1. 가정용(liter당 50원)");
		System.out.println("2. 상업용(liter당 45원)");
		System.out.println("3. 공업용(liter당 30원)");
		System.out.println("---------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		// 메뉴선택 code
		System.out.println("메뉴 코드를 입력 > ");
		int code = sc.nextInt();
		
		// 1, 2, 3 이외의 code가 들어오면 프로그램 종료
		if(code < 1 || code > 3) {
			System.out.println("코드를 잘못 입력하셨습니다. 프로그램 종료합니다~");
			System.exit(0); // 프로그램 종료 명령
		}
		
		// 사용량 입력받기, usage
		System.out.print("사용량을 입력하세요 > ");
		int usage = sc.nextInt();
		
		// switch문으로 요금계산하기, 요금변수 : fare
		int fare = 0;
		switch(code) {
		case 1:
			fare = usage * 50;
			break;
		case 2:
			fare = usage * 45;
			break;
		case 3:
			fare = usage * 30;
			break;
		}		
		
		// 위의 switch문에서 사용요금 계산되면 10% 세금 부여, tax
		double tax = fare * 0.1;		
		// 총 수도요금(사용요금+세금), total
		double total = fare + tax;
		
		System.out.println("==================");
		System.out.println("메뉴코드 : " + code);
		System.out.println("사용요금 : " + fare + "원");
		System.out.println("==================");
		System.out.println("총수도요금 : " + total + "원");
	} // 프로그램 종료
}

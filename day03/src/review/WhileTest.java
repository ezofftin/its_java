package review;

import java.util.Scanner;

public class WhileTest {
	// main() 메소드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력하세요 > ");
			String id = sc.next();
			
			// id : test, pw:1234			
			if(id.equals("test")) { // 아이디가 일치하는 경우
				while(true) {
					System.out.print("비밀번호를 입력하세요 > ");
					String pw = sc.next();
					
					if(pw.equals("1234")) {
						System.out.println("로그인 성공!!");
//						break;
//						System.exit(0);
						return; // 메소드의 종료
					}else { // 비밀번호 불일치
						System.out.println("비밀번호가 일치하지 않습니다!!");
					}
				} // end of while
			}else { // 아이디가 일치하지 않는 경우
				System.out.println("아이디를 다시 확인하세요!!");
			}
		} // end of while
	} // end of main
}

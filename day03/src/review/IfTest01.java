package review;

public class IfTest01 {
	public static void main(String[] args) {
		int x = 10;
		if(x > 5) 
			System.out.println("참");
		
		if(!true) {
			System.out.println("참");
		}
		
		if(!(x>5)) { //!는 부정
			System.out.println("참");
		}
		
		if(!false) {
			System.out.println("참");
		}
		
		int num = 33;
		
		if(num % 2 == 0) {
			System.out.println("짝");
		}else {
			System.out.println("홀");
		}
		
		System.out.println("------------");
		// 위의 if문을 삼항(조건)연산자로 변형하기
		// 조건 ? 참일때 값 : 거짓일때 값
		
		String str = num%2==0 ? "짝" : "홀";
		System.out.println(str);
		
//		System.out.println(num%2==0 ? "짝" : "홀");
		
		
		System.out.println("---------");
		int a = -10;
		if(a > 0) System.out.println("양수");
		if(a < 0) System.out.println("음수");
		if(a == 0) System.out.println("제로");
		System.out.println("------------");
		// 위의 조건식을 삼항 연산자로 변형
//		str = (a == 0) ? "제로" : "제로아님";
		str = (a == 0) ? "제로" : (a>0 ? "양수" : "음수");
		System.out.println(str);
		
	}
}








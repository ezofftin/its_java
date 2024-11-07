package review;

public class ForTest {
	public static void main(String[] args) {
		// 1*
		// 2**
		// 3***
		// 4****
		// 5*****
		
		for(int i = 1; i<6;i++) {
			System.out.print(i);
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// for문을 통해서 구현해보세요
		
		// 1. 안녕 5번
		for(int i=0; i<5; i++) {
			System.out.println("안녕");
		}		
		
		// 2. 1~10까지 합계 구하기
		int sum = 0; 			// 합계를 저장할 변수                              
		for(int j=1; j<=10; j++) {
			sum += j;			
		}
			System.out.println("1~10까지의합: "+sum);		
		
		// 3. 1~입력값까지 합계 구하기
			Scanner sc = new Scanner(System.in);
			int num = 0;
			int l = 0;
			System.out.print("숫자를 입력하세요>>");
			l = sc.nextInt();
			for(int k=1; k<=l; k++) {
				num+=k;
			}
			System.out.println("1~"+l+"까지의 합:"+num);
	}
}

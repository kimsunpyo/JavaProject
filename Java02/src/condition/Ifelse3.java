package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 변수 = sc.nextInt();
		
		// 1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		int age;
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인");
		}else if(age >= 14 && age < 20) {
			System.out.println("청소년");
		}else if(age < 14) {
			System.out.println("어린이");
		}		
		
		// 2. 학점 계산(90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F)
		int score;
		System.out.println("점수를 입력하세요");
		score = sc.nextInt();
		
		if(score>=90) {
			System.out.println('A');
		}else if(score>=80) {
			System.out.println('B');
		}else if(score>=70) {
			System.out.println('C');
		}else
			System.out.println('F');
		
		// 3. 비밀번호를 정해놓고 사용자가 비밀버호를 입력해서 맞추면 '비밀번호가 맞습니다.'
		// 틀리면 '비밀번호가 다릅니다.' (비밀번호는 정수)
		int num;
		System.out.println("비밀번호를 입력하세요");
		num = sc.nextInt();
		
		if(num == 1234) {
			System.out.println("비밀번호가 맞습니다");
		}else
		System.out.println("비밀번호가 다릅니다");
		
		// 4
		
		
	}
}

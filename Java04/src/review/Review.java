package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 1~10 중 짝수만 출력하기
		int i = 0; 
		
		while(i<10) {
			i++;
			if (i%2==1) {
				continue;
			}
			System.out.println(i);
		}	
		
		
		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 정수, 맞추면 맞췄다하고 종료, 기회를 모두 사용하면 접속불가)
		// 비밀번호 1234
		
		
		int pwd = 1234;
		int user_input = 0;
		
		for(int j=0; j<5; ++j) {
			System.out.print("비밀번호를 입력하세요>>");
			user_input = sc.nextInt();
			if(user_input == pwd) {
				System.out.println("맞았습니다!");
				break;
			}
			if(j==4) {
				System.out.println("접속불가");
			}
		}
		
		// 3. 시험합격 점수는 국어, 영어, 수학이 각각 40점 이상이고 총점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 총점이 미달되면 총점미달
		
		
		int kor = 0;
		int eng = 0; 
		int math = 0;
		
		System.out.print("국어점수를 입력하세요>>");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요>>");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요>>");
		math = sc.nextInt();
		
		int sum = kor+eng+math;
				
		if((kor>=40 && eng >= 40 && math >=40) && sum>=150) {
			System.out.println("합격");
		}else if((kor<40 || eng<40 || math<40)) {
			System.out.println("과락");
		}else if(sum<150) {
			System.out.println("총점미달");
		}
		
		
		 
		
		// 4. 1~10까지의 합 구하기(반복문)
		
		int k = 0;
		int 합계 = 0;
		
		while(k<10) {
			k++;
			합계+=k;
		}
		System.out.println("1~10까지의 합계:"+합계);	
		
		
		
		// 5. 10~1까지 거꾸로 출력하기(반복문)
		int l = 10;
		while(l>0) {
			System.out.print(l+" ");
			l--;
		}
		
		
		
	}
}
		

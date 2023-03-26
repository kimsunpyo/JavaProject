package array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		// 국가와 수도 (5개)
		/*
		대한민국의 수도는 서울입니다
		일본의 수도는 도쿄입니다
		중국의 수도는 베이징입니다
		미국의 수도는 워싱턴입니다
		러시아의 수도는 모스크바입니다
		*/
		String con[] = {"대한민국", "일본", "중국", "미국", "러시아"};
		String cap[] = new String[5];
		cap[0] = "서울";
		cap[1] = "도쿄";
		cap[2] = "베이징";
		cap[3] = "워싱턴";
		cap[4] = "모스크바";
		
		System.out.println("[국가별 수도]");
		for(int i=0;i<con.length;i++) {
			System.out.println(con[i]+"의 수도는 "+cap[i]+"입니다");
		}
		
		
		// 사용자 입력으로 국가를 받아서
		// 해당국가의 수도를 알려주는 프로그램을 만들어보세요
		/*
		 수도를 알고자하는 국가의 이름을 입력하세요>>
		 대한민국 ==> 서울
		 일본 ==> 도쿄 
		*/
		
		// 같은 문자열을 찾으면 해당 i(방번호)를 백업
		// 백업한 방번호를 통해서 수도를 출력
		
		
		Scanner sc = new Scanner(System.in);
		String user_input = "";
		int bk_index = -1;
		System.out.print("수도를 알고자하는 국가의 이름을 입력하세요>>");
		user_input = sc.next();
		
		// 해당하는 위치를 찾는다
		for(int i=0;i<con.length;++i) {
			if(user_input.equals(con[i])) {
				bk_index = i;
				break;
			}
		}
		
		if(bk_index == -1) {
			// 못찾았다
			System.out.println("해당 국가가 없습니다");
		}else {
			// 찾았으니깐 값이 변경되었겠지
			System.out.println(con[bk_index]+"의 수도는 "+cap[bk_index]+"입니다");
		}
				
		
	
		
		
		
		
		
		

	}
}

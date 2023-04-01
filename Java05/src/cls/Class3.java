package cls;

public class Class3 {
	public static void main(String[] args) {
		// 아빠차, 엄마차, 내차
		자동차 아빠차 = new 자동차();
		자동차 엄마차 = new 자동차();
		자동차 내차 = new 자동차();
		
		아빠차.차주인 = "아빠";
		아빠차.차종 = "벤츠";
		아빠차.차색상 = "블랙";
		
		
//		엄마차.차주인 = "엄마";
//		엄마차.차종 = "마티즈";
//		엄마차.차색상 = "황색";
		
		
		내차.차주인 = "나";
		내차.차종 = "스타렉스";
		내차.차색상 = "회색";
		
		아빠차.차정보();
		엄마차.차정보();		// 값을 안담고 사용하면 버그 발생(null)
		내차.차정보();
		
	}
}

class 자동차 {
	String  차주인, 차종, 차색상;
	
	void 차정보() {
	System.out.println("주인은 "+차주인+"이고 차종은 "+차종+"이고 차색상은 "+차색상+"이다");
}}

// class 자동차
// 데이터 : 차주인, 차종, 차색상
// 기능 : 차정보(주인이 누구인이, 차종은 무엇인지, 차색상은 무엇인지 안내해주는 출력)

package cls;

public class Review {
	public static void main(String[] args) {
		// 클래스와 메서드
		// 객체지향기법 : 클래스기반, 클래스 정의와 객체화를 많이 해봐야함
		// 객체화
		// 클래스명 변수명 = new 클래스명();
		Mymodel mm = new Mymodel();		// 다른 클래스의 변수나 메서드를 사용하려면 '객체화'를 해줘야함
		Mymodel mm2 = new Mymodel();		// 객체가 다르면 형태와 메서드는 같지만 변수가 다름(다른 공간)
		String str = "안녕";
		String str2 = "반갑";
		
		mm.setStr("안녕");			// mm.str = "안녕";
		mm2.setStr("반갑");			// mm2.str = "반갑";
		
//		MyView mv = new MyView;		// 출력용 클래스
//		mv.printStr(mm);
//		mv.printStr(mm2);
//		
//		mv.printNum(mm);
//		mv.printNum(mm2);
	}
}

// MVC패턴 웹유행(Model(구조체같은-View(html화면)-Controller(java코드와 html코드 연결))
// 사용할 변수를 지정해놓고 갖다 사용할 수 있는 클래스(구조체처럼)
class Mymodel{
	// 변수들, 변수에 값을 대입하거나 사용할 수 있는 메서드만
	// 클래스 : 변수+함수를 묶어놓은 것(멤버변수,메서드)
	
	// 멤버변수
	int num;
	String str;
	
	// 메서드
	// 1. num변수에 값을 넣기
	void setNum(int num) {		// ()에 변수가 있으니깐 사용할 때 대입이 될 것이다
		// void : return을 안쓰겠다(사용하는 곳에 넘겨줄 값이 없다)
		this.num = num;		
	}
	
	// 2. num변수 사용하기
	// 사용하려면 사용한 곳에 값을 넘겨줘야하기 때문에 자료형을 넣어준다
	int getNum() {		 // 정수값 num을 사용한 곳에 return(전달)해줄 것이기 때문에 자료형은 int
		return num;	
	}// 이름이 중복되는 매개변수나 지역변수가 없으면 this.은 생략가능
	// 3. str 값 넣기
	void setStr(String str) {
		this.str = str;
	}
	// 4. str값 사용하기
	String getStr() {
		return str;
	}			
}

// 출력용 (화면,소리, ...)
class Myview {
	
}
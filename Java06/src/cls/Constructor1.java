//package cls;
//
//public class Constructor1 {
//	public static void main(String[] args) {
//		// 클래스의 생성자
//		// 클래스는 초보자를 위한 문법, 초기에 먼저 해줘야할 작업을 자꾸 빼먹는다...
//		MyClass9 m1 = new MyClass9(9, "홍길동", 130.9);
//		MyClass9 m2 = new MyClass9();
//		
//		MyClass9Test mv = new MyClass9Test();
//		mv.test(m1);
//		mv.test(m2);
//		mv.test(m3);
//	}
//}
//
//class MyClass9{
//	// 생성자 (초기셋팅을 빼먹지 못하도록)
//	public MyClass9() {      // 자료형은 적지 않습니다
//		// 초기값 셋팅을 위한 메서드이기 때문에 자료형은 적지 않는다
//	}
//	// 멤버변수
//	private int age;
//	private String name;
//	private double height;
//	public int getAge() {
//		return age;
//	}
//	
//	// 메서드
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getHeight() {
//		return height;
//	}
//	public void setHeight(double height) {
//		this.height = height;
//	}
//}
//
//class MyClass9Test{
//	public void test(MyClass9 mc) {
//		if(mc.getAge() < 13) {
//			System.out.println(mc.getName()+"은(는) 나이가 적습니다. 탑승불가");
//		}else if(mc.getHeight() < 150) {
//			System.out.println(mc.getName()+"은(는) 키 미달. 탑승불가");
//		}else {
//			System.out.println("탑승가능");
//		}
//	}
//}
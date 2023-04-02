package cls;

public class Constructor2 {
	public static void main(String[] args) {
		Person ps = new Person("홍길동", 25);
		PersonView pv = new PersonView(ps);
		pv.info();
	}
}

class Person{
	// 멤버변수 : 이름, 나이
	private String name;
	private int age;
	
	// 생성자 (생성자 통해서 멤버변수 초기화)
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	// 게터세터(public)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class PersonView{
	private Person person;
	// 기본 생성자
	public PersonView() {}
	// 생성자 오버로딩 : 받아온 객체를 멤버변수에 백업
	public PersonView(Person person) {
		this.person = person;
	}
	// 메서드(멤버변수 출력용)
	public void info() {
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
	
	// 메서드 오버로딩 (바뀐 사람으로 저장 후 출력)
	public void info(Person person) {
		this.person = person;
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
}

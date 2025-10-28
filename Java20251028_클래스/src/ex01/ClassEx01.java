package ex01;

public class ClassEx01 {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.name = "안창현";
		s1.age = 29;
		s1.address = "강동구 천호동";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address);
		s1.study();
		
		System.out.println("--------------------");
		
		Student s2 = new Student();
		s2.name = "선하영";
		s2.age = 28;
	    s2.address = "강동구 암사동";
	    
	    System.out.println(s2.name);
	    System.out.println(s2.age);
	    System.out.println(s2.address);
	    s2.study();
   	}

}

/*
 * 클래스 - 멤버변수(속성), 멤버 메소드(함수)
 * 멤버변수 - 정적(상태), 멤버메소드 - 동적(행동)
 * void는 특별한 데이터 타입으로, 함수 또는 메서드의 리턴 타입을 나타냄. 리턴 타입이란 메서드가 수행한 작업의 결과를 반환하는 데이터 타입을 의미. 하지만 void는 리턴값이 없음을 나타냄 
 */
class Student{
	String name;
	int age;
	String address;
	
	void study() {
		System.out.println(name + " Java 공부 중 입니다. ");
	}
}

package ex06;

public class ClassEx01 {

	public static void main(String[] args) {
	
		Student s1 = new Student();
	    
		s1.setAge(29);
		System.out.println(s1.getAge());
		
		s1.setName("안창현");
		System.out.println(s1.getName());
		
		s1.setAddress("강동구 천호동");
		System.out.println(s1.getAddress());
		
		s1.study();
		
		System.out.println("--------------------");
		
		Student s2 = new Student();
		
		s2.setName("선하영");
		s2.setAddress("강동구 암사동");
		s2.setAge(25);
		
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getAddress());
		
	    s2.study();
	    
	    System.out.println("--------------------");
	    
	    Student s3 = new Student("박진희 ", 27, "강동구 명일동");
	    
	    System.out.println(s3.getName());
	    System.out.println(s3.getAge());
	    System.out.println(s3.getAddress());
	    
	    s3.study();
	    
	    
   	}

}

/*
 * 클래스 - 멤버변수(속성), 멤버 메소드(함수)
 * 멤버변수 - 정적(상태), 멤버메소드 - 동적(행동)
 * void - 함수 또는 메서드의 리턴 타입을 나타냄. 리턴 타입이란 메서드가 수행한 작업의 결과를 반환하는 데이터 타입을 의미. 하지만 void는 리턴값이 없음을 나타냄 
 */
class Student{
	
	//멤버 변수는 무조건 private 접근 제어자를 사용!!
	//private은 클래스 내에서만 접근할 수 있도록 멤버를 제한하는 가장 엄격한 접근 제어자
	//멤버 변수에 접근할 수 있는 통로 => setter(저장), getter(출력)를 만든다. 
	private String name;
	private int age;
	public String address;
	
	//디폴드 생성자.
	public Student() {
		System.out.println("디폴드 생성자 호출!");
	}
	
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.address = addr;
	}
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void study() {
		System.out.println(name + "Java 공부 중 입니다. ");
	}
	
	

}

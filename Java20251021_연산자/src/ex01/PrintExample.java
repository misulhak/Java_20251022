package ex01;

/*
 * 작성사 :박진희
 * 작성일 : 2025.10.21
 * 코드의미 : 학습용
 */

/*
 * 1. 한 파일안에는 한 클래스만 있는 것이 일반적
 * 2. 두 개 클래스가 존재하면 public 키워드는 한 곳만 지정
 *    --> public 키워드가 있는 곳 클래스명이 파일명
 * 3. public이 없는 클래스가 두 개 이상 존재할 때는 파일명은 클래스명 아무거나 사용 가능
 *   단, main 함수가 있다면 main 함수가 있는 곳 클래스 명을 파일명으로 기입한다. 
 */
public class PrintExample {

	public static void main(String[] args) {

		// 이 코드는 콘솔 출력시 사용하는 구문
		System.out.println("Hello, Java");
		
		int age = 100;

		System.out.print("안녕하세요, "+ age +" 박진희입니다.");
		System.out.print("안녕하세요, "+ age +" 박진희입니다.");
		System.out.print("안녕하세요, "+ age +" 박진희입니다.");
		System.out.print("안녕하세요, "+ age +" 박진희입니다.");
		System.out.print("안녕하세요, "+ age +" 박진희입니다.");
		
		//sysout

		/*
		 * System.out.print("안녕하세요, 박진희입니다."); System.out.print("안녕하세요, 박진희입니다.");
		 * System.out.print("안녕하세요, 박진희입니다.");
		 */

		// 한 줄 주석
		/*
		 * 여러줄 주석
		 */

		// System.out.print() - 줄 바굼 없음
		// System.out.println() - 줄 바꿈 있음

	}

}

class Test {

}
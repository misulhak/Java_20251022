package ex01;

import java.util.Scanner;

public class 비교연산자 {

	public static void main(String[] args) {
		
		int numA = 5;
		int numB = 10;
		
		System.out.println(numA == numB);
		System.out.println(numA != numB);
		System.out.println(numA > numB);
		System.out.println(numA < numB);
		System.out.println(numA <= numB);
		
		
		System.out.println("--------------------");
		String s1 = "Korea";
		String s2 = "Korea";
		//System.out.println(s1 == s2); 가능하지만 반드시 equals 사용
		System.out.println(s1.equals(s2));
		
		System.out.println("--------------------");
		
		String s3 = new String("korea"); //문장이 너무 김. String s1 = "korea"; 사용. 용량도 아낌
		String s4 = new String("korea");
		//System.out.println(s3 == s4); x
		System.out.println(s3.equals(s4));
		
		
		System.out.println("==========논리연산==========");
		numA = 5;
		numB = 10;
		int numC = 13; //numC는 처음 사용하니까 int 입력
		int numD = 9; //numD는 처음 사용하니까 int 입력
		
		System.out.println(numA < numB);
		System.out.println(numC < numD);
		
		System.out.println("-----------AND-----------");
		System.out.println((numA < numB) && (numC < numD)); 
		//&, && 둘 다 가능. 하지만 C언어와의 호환성을 위해 && 사용
		//시간 절약을 위해 거짓 수식을 앞에 배치
		
		System.out.println("-----------OR------------");
		System.out.println((numA < numB) || (numC < numD)); 
		//|, || 둘 다 가능. 하지만 C언어와의 호환성을 위해 || 사용
		//시간 절약을 위해 사이클이 짧은 것을 앞에 배치
		
		System.out.println("-----------NOT-----------");
		System.out.println(!(6>4));
		//'!(6>4)' 이렇게 앞에 '!'를 넣으면 문장을 부정함. 예를들어 true면 false로 변환
		
		System.out.println("-----------XOR-----------");
		System.out.println(15 ^ 12);
		//15를 2진법으로 바꾸면 1111, 12를 2진법으로 바꾸면 1100 이 두 개를 뭐시기 연산을(..)하면 0011. 0011은 3이다. 그래서 결과값이 3이 나옴
		
		System.out.println("----------삼형연산자(조건연산자)------------");
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 나이 입력 받아서, 20보다 크면 성년, 아니면 미성년
		 
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		
		String state = (age>=20)? "성년" : "미성년"; //참이면 state에 '성년'저장 거짓이면 '미성년'저장
	    System.out.println("당신은 " + state);
	    */
	    
	    /*
	     * 정수 입력 받아서, 2로 나누어서 나머지가 0이면 짝수, 아니면 홀수
	     */
		
		/*System.out.println("정수 입력 >> ");
		int number = sc.nextInt();
		
		String state = (number % 2 == 0)? "짝수" : "홀수"; //'=='은 두 피연산자의 값이 같은지 검사
		System.out.println(number + "은(는) " + state);
		*/
		
		/*
		 * 정수 입력 받아서, 3의로 나누어서 나머지 0,1,2 판별
		 */
		
		System.out.println("정수 입력 >> ");
		int number = sc.nextInt();
		//int state = (number % 3 == 0)? 0 : 1;
		int state = (number % 3 == 0)? 0 : (number % 3 == 1)? 1 : 2;
		System.out.println(number + "를 3으로 나눈 나머지는 " + state + "입니다. ");
		
		/* && = 피연산자 모두가 true 일 경우에만 연산 결과가 true
		 * || = 피연산자 중 하나면 true이면 연산 결과는 true
		 * ^ = 피연산자 하나는 true이고 다른 하나가 false 이면 연산 결과는 true
		 * ! = 피연산자의 논리값을 바꿈
		 */
		
		
	}

}

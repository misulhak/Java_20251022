package ex01;

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
		
		
		

	}

}

package ex02;

/*
 * 정수 배열 5개 생성 후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 * Arrays 클래스 : 배열을 다루기 위한 다양한 방법을 제공.특정 값으로 요소를 정렬하거나, 검색 및 채우는 것과 같은 일반적인 배열 작업을 제공한다.
 * 1차원 배열의 출력 : Arrays.toString(int [ ] arr) 는 지정된 배열을 문자열의 형태로 반환한다. 일반적으로 배열을 반복문을 사용하지 않고 출력하기 위해 사용한다.  
 */
public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] numArr = new int[5];
		
		numArr[0] = 90;
		numArr[1] = 80;
		numArr[2] = 70;
		numArr[3] = 60;
		numArr[4] = 50;
		
		int sum = 0;
		
		//sum = numArr[0]+numArr[1]+numArr[2]+numArr[3]+numArr[4]; 권장하지 않는 방법
		
		for(int i=0; i<5; i++)
			sum += numArr[i];
		System.out.println("총합 : " + sum);
		
		/*
		 * sum = sum + numArr[0]
		 * sum = sum + numArr[1]
		 * sum = sum + numArr[2]
		 * sum = sum + numArr[3]
		 * sum = sum + numArr[4]
		 */
		

	}

}

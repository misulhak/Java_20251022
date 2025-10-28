package ex04;

import java.util.Arrays;

/*
 * 1. 배열 10개 방에 랜덤하게 1~100사이 값을 저장
 * 2. 배열에서 최대값, 최소값을 출력
 * 3. 10값 총점 / 평균 구하기
 * 4. 10개의 값을 정렬(오름차순)
 */
public class 연습문제 {

	public static void main(String[] args) {
		
		int[] iArr = new int[10];
		
		//1. 배열 10개 방에 랜덤하게 1~100사이 값을 저장
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println(Arrays.toString(iArr));
		
		//2. 배열에서 최대값, 최소값을 출력
		int max, min;
		max = min = iArr[0]; //최대값과 최소값을 배열의 첫 번째 값으로 초기화
		for(int i = 0; i < iArr.length; i++) {
			
			if(max < iArr[i])
				max = iArr[i]; //만약 현재 max 변수에 저장된 값보다 iArr[i]의 값이 더 크다면, max 변수의 값을 iArr[i]의 값으로 갱신
			
			if(min > iArr[i])
				min = iArr[i]; //만약 현재 min 변수에 저장된 값보다 iArr[i]의 값이 더 작다면, min 변수의 값을 iArr[i]의 값으로 갱신
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		//3. 10값 총점 / 평균 구하기
		int sum = 0; //배열의 모든 값들을 더할 sum 변수를 선언하고 0으로 초기화
		double avg = 0; //평균을 저장할 avg 변수를 선언. 평균은 소수점이 나올 수 있으므로 double 형을 사용
		
		for(int i = 0; i < 10; i++)
			sum += iArr[i]; //반복문을 돌면서 배열의 각 요소 iArr[i]의 값을 sum에 계속 더해나감
		
		avg = (double)sum/iArr.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		//4. 10개의 값을 정렬(오름차순)
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr.length -i -1; j++) {
				if(iArr[j] > iArr[j+1]) { //현재 위치의 값(iArr[j])이 바로 다음 위치의 값(iArr[j+1])보다 크다면, 두 값의 순서가 잘못된 것이므로 교환
					int tmp = iArr[j]; //tmp라는 임시 변수에 현재 위치의 값을 잠시 저장
					iArr[j] = iArr[j+ 1]; //다음 위치의 값을 현재 위치로 옮김
					iArr[j+1] = tmp; // 임시 변수에 저장했던 원래 현재 위치의 값을 다음 위치로 옮깁니다. 이로써 두 값의 교환이 완료
				}
			}
		}
		System.out.println("정렬 : " + Arrays.toString(iArr));
	}

}

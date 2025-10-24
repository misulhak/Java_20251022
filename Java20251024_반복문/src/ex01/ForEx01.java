package ex01;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0 ;
		
		/*
		 * for(초기값 ; 조건 ; 증가값)
		 *     조건 만족 하면 실행 될 코드(실행코드)
		 * 실행 순서
		 * 처음 : 초기값 -> 조건 -> 실행코드 -> 증가값
		 * 이후 : 조건 -> 실행코드 -> 증가값
		 */
		
		/*
		 * 반복문 : 조건을 만족할 때까지 무한 반복
         * for : 몇 번 반복해야 되는지 알 때
         * while : 횟수를 정확히 모를 때
         * 조건 검색 false 실행되지 않음 - 한 번도 실행되지 않을 수 있음
         * 
         * do ~ while
         * 조건이 false 1회 실행 보장
         */

		for(int i = 1; i <= 5; i++) {
			sum += i;
		}
		
		System.out.println("합 : " + sum);
		
	}

}

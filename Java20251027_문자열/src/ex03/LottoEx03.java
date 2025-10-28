package ex03;

import java.util.Arrays;

public class LottoEx03 {

	public static void main(String[] args) {
		
		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
		
		int[] lotto = new int[6];
		int count = 1;
		
		for(int i=0; i<lotto.length; i++) {
			
			//1~45까지 랜덤숫자 나옴
			int tmp = (int)(Math.random()*45)+1; //Math.random()이 0.0 이상 1.0 미만의 실수를 생성 여기에 45를 곱하면 $0.0$에서 $44.999...$까지의 범위가 되고, (int) 형변환을 통해 정수(0부터 44까지)를 얻은 후, 마지막에 1을 더하여 최종적으로 1부터 45까지의 난수를 생성
			
			lotto[i] = tmp; //tmp 변수에 저장된 값을 lotto 배열의 i번째 요소에 할당하는 연산
			count++;
			//중복 체크
			for(int j=0; j < i; j++) { //이 for 반복문은 j 변수를 0부터 시작하여 i보다 작을 때까지 \(\text{1}\)씩 증가시키면서 반복적으로 실행. 즉, 반복문은 총 i번 실행
				if(tmp == lotto[j]) {
					i--;
					break;
				}//end if
			}//end j
		}//end i
		
		System.out.println(Arrays.toString(lotto));
		System.out.println("반복횟수 : " + count); 
	
	}//end main
}//end
			

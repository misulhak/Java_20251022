package ex01;

public class ForEx02 {

	public static void main(String[] args) {
		
		int sum=0;
		
		/*
		 * 1 ~ 100까지 짝수 합
		 */
		
		/*
		for(int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		*/
		
		for(int i=1; i<=100; i++) { //몇 번  회전하는지 알기 때문에 'for' 사용
			if(i % 2 == 0)
				sum += i;
		}
		
		System.out.println("합 : " + sum);
		
	}

}

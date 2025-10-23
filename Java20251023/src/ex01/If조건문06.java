package ex01;

public class If조건문06 {

	public static void main(String[] args) {
		/*
		 * 버스 요금 계산표
		 * 요금 : 2000
		 * 65세 이상 : 무료
		 * 20 ~ 64 : 할인률 0%
		 * 15 ~ 19 : 할인률 20%
		 * 7 ~ 14 : 할인률 50%
		 * 6세 미만 : 무료
		 */
		int age = 95; //나이
		int fee = 2000; //요금
		double rate = 0; //할인율
		
		if(age >= 65) {
			fee = 0;
		}else if(age >= 20 && age < 65) {
			rate = 0;
		}else if(age >= 15 && age < 20) {
			rate = 0.2;
		}else if(age >= 7 && age < 15) {
			rate = 0.5;
		}else {
			rate = 0;
		}
		
		if(fee != 0) {
			fee = (int)(fee * (1 - rate)); //요금이 0원이 아닐 시에만 계산하라는 수식
		}
		
		fee =(int)(fee*(1 - rate));
		
		System.out.println("나이 " + age + "세는 " + fee + "요금 입니다. ");
		
	    System.out.println("------프로그램 종료------");

	}

}
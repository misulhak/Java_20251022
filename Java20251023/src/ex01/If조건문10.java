package ex01;

public class If조건문10 {

	public static void main(String[] args) {
		
		
		
		int num = (int)(Math.random()*100) + 1;  //1 ~ 
        System.out.println(num + "점수는 : ");
		
		switch( num / 10 ) {
		case 10 :
		case 9 :
			System.out.println("A학점");
			break;
		case 8 : 
			System.out.println("B학점");
			break;
		case 7 : 
			System.out.println("C학점");
			break;
		case 6 :
			System.out.println("D학점");
			break;
			
		default : //default = if문의 else 같은 기능
			System.out.println("F학점");
			
		}
					
	    System.out.println("------프로그램 종료------");

	}

}

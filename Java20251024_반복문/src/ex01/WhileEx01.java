package ex01;

public class WhileEx01 {

	public static void main(String[] args) {
		
		/*
        int sum = 0 ;
		    
		     초기값       조건    증가  
		for(int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println("합 : " + sum);
		*/
		
		int sum=0;
		int i=0;
		
		while(i<5) {
		    i++;
		    sum += i;
		}
		
		System.out.println("합 : " + sum);

	}

}

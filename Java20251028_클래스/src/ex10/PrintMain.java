package ex10;

import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {
		
		//Math.random(); -> 정적 메소드
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		
		Printer p = new Printer();
		p.println(1000);
		
		Printer.println(10);
		
		Printer p2 = new Printer();
		p2.print();

	}

}

package ex01;

public class CharAtEx01 {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		char ch = subject.charAt(0); //'자바 프로그래밍'에서 해당하는 index번호의 문자 추출
		
		System.out.println(ch);
		
		int len = subject.length(); //'자바 프로그래밍' 단어 개수
		System.out.println("문자열 길이 : " + len);
		
		System.out.println("----문자열 대체(변경)----");
		System.out.println("before : " + subject);
		subject=subject.replace("자바", "파이썬");
		
		System.out.println("after : " + subject); //'자바 프로그래밍' 문장에서 '자바'를 '파이썬'으로 변경해서 새로운 문자열 생성
		
		System.out.println("----문자열 잘라내기----");
		String sub2 = subject.substring(4); //index 4번째 위치에서 전부 다 문자 추출
		System.out.println(sub2);
		
		String sub3 = subject.substring(4,6);//index 4번째 위치에서 6번 전까지 추출. 즉, 4와 5 추출 
		System.out.println(sub3);
		
		System.out.println("----문자열 찾기----");
		int index = subject.indexOf("프로그래밍"); //'파이썬 프로그래밍'에서 프로라는 단어는 몇 번째 index에 있는가?
		System.out.println("문자열 찾기 : " + index);
		
		System.out.println("----문자열 분리----");
		String[] sub4 = subject.split(" "); //[] = 방을 분리해줌 //'파이썬 프로그래밍' 문자열을 공난 기준으로 분리
		System.out.println(sub4[0]);
		System.out.println(sub4[1]);
		
		System.out.println("----문자열 합치기----");
		String s = "대한";
		String s2 = "민국"; //s가 가지고 있는 '대한'에 s2가 가지고 있는 민국을 합쳐서 새로운 문자열 '대한민국' 생성
		String s3 = s.concat(s2);
		System.out.println(s3);

	}

}

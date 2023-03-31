package sec03.exam01;

import java.util.Scanner;

public class Template20230317 { //public-클래스 선언부, Template어쩌고...클래스명

	public static void main(String[] args) { //public static 솰라솰라...메소드 선언부, main-메소드명 
		
		Scanner sc = new Scanner(System.in);
		
		
		char a = sc.nextLine().charAt(3);
		int num = a;
		System.out.println(num);
		
		if (a >= 48 && a <= 57) {
			System.out.println("숫자입니다 ==>" + num);
		} else if (a >= 97 && a <= 122) {
			System.out.println("소문자입니다 ==>" + num);			
		} else if (a >= 65 && a <= 90) {
			System.out.println("대문자입니다 ==>" + num);
		} else if (a >= 44032 && a <= 55203) {
			System.out.println("한글입니다 ==>" + num);
		} else 
			System.out.println("뭔데 이게");
		
		
	
	}
}

package sec03.exam01;

import java.util.Scanner;

public class ArrayPlus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("내가만든배열크기~");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("배열에넣을" + arr.length + "개의값을입력하시오~~");
		
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			m += arr[i];
		}
		
		System.out.println("전체 합!");
		System.out.println(m);

	}

}

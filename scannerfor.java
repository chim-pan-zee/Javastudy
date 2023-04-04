package Asciipa;

import java.util.Scanner;

public class Ascii {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      String a = scanner.nextLine();
      
      
      
      for (int i = 0; i < a.length(); i++) {
         char b = a.charAt(i);
         
         if (b >= 48 && b <= 57) {
                System.out.println(b + " 는 숫자인듯");
            }   else if (b >= 65 && b <= 90) {
                System.out.println(b + "는 대문자인거같은데요");
            }   else if (b >= 97 && b <= 122) {
                System.out.println(b + " 는 소문자인거같기도하고아닌거같기도하고");
            }   else if (b >= 44032 && b <= 55203) {
                System.out.println(b + " 이거는우리나라의자랑스러운한글인드스와");
            }   else {
               System.out.println("뭔데이게");
            }
      }

   }

}

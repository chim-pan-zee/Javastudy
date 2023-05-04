package sec03.LoginSystem;

import java.util.*;

import sec03.exam01.LoginVerify;

public class Login {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner (System.in);
      LoginVerify login = new LoginVerify();
      
      String[] userId = {};
      String[] userPw = {};
      String[] newId = {};
      String[] newPw = {};
      
      boolean loginStatus = false; 
      boolean signInStatus = false; //로그인 상태
      boolean alphabet = false;

      Loop1:
      while (true) {
      
         System.out.println("1.로그인 2.회원가입 3.로그아웃 4.회원목록 5.종료");
         int select = sc.nextInt();
         
         
         
        if (select == 2) { //2
            System.out.println("회원가입을 실행합니다.");
            
            Loop2 :
            while (true) {
               if (loginStatus == true) {
               System.out.println("이미 로그인 된 상태입니다. 로그아웃 후 새로운 계정을 생성하시겠습니까? y/n");
               String yesOrNo = sc.next(); 
               if (yesOrNo.equals("y")) { 
                  loginStatus = false;
                  break Loop2;
               } 
               else if (yesOrNo.equals("n")) {
                  break Loop2;
               }
            }
               
               Loop3 :
             while (true) {
                System.out.println("ID를 입력하세요");
                String id = sc.next();
               
                System.out.println("비밀번호를 입력하세요");
                String pw = sc.next();
               
                if (pw.length() < 4) {
                   System.out.println("비밀번호는 4글자 이상에 알파벳이 포함되어야 합니다.");
                  break;
                }
                for (int i = 0; i < pw.length(); i++) {
                 char c = pw.charAt(i);
                 for (char j = 'a'; j <= 'z'; j++) {
                    if (c == j) {
                       alphabet = true;
                  continue;
                  }
                 }
                }
               if (alphabet == false) {
            System.out.println("비밀번호는 4글자 이상에 알파벳이 포함되어야 합니다.");
            break Loop3;
               }
               
               newId = new String[userId.length + 1];
               newPw = new String[userId.length + 1];
               for (int i = 0; i < userId.length; i++) {
                  newId[i] = userId[i];
                  newPw[i] = userPw[i];
               }
               
               newId[userId.length] = id;
               newPw[userPw.length] = pw;
               
               userId = newId;
               userPw = newPw;
               
               System.out.println("가입ID:" + id);
               System.out.println("가입비번:" + pw);
               signInStatus = true;
               break Loop2;
   
            }
           }
         } 
           
         else if (select == 1) { //1
           Loop2 :
           while (true) {
              if (loginStatus == true) {
                System.out.println("이미 로그인 상태입니다");
                break;
             }
              System.out.println("로그인을 하시오.");
              
               System.out.println("id 작성");
               String idVerify = sc.next();
               
               System.out.println("비밀번호 작성");
               String pwVerify = sc.next();
               
               System.out.println("가입아이디:" + idVerify + " 가입비번:" + pwVerify);
               
               if (signInStatus == true) {  	   
            	  login.loginSuccess(loginStatus, userId, newId, newPw, idVerify, pwVerify); //객체지향을 활용한 첫번째 
                  if (signInStatus == true) {
					 break Loop2;
				}
              }
              else if (signInStatus == false || loginStatus == false){
                 System.out.println("해당 id가 존재하지 않습니다. 다시 로그인 하시겠습니까? y/n");   
                String yesOrNo = sc.next();
            
                if (yesOrNo.equals("y")) {
                   System.out.println("재 로그인");
                   break;   
                } 
                else if (yesOrNo.equals("n")) {
                   System.out.println("로그인 취소");
                   break Loop2;
                }
              }
          } 
        } 
         
         else if (select == 3) { //3
            while (true) {
               if (loginStatus == true) {
                  System.out.println("로그아웃 하시겠습니까? y/n");
                  String yesOrNo = sc.next();
                  if (yesOrNo.equals("y")) {
                     loginStatus = false;
                     break;
                  } 
                  else if (yesOrNo.equals("n")) {
                     break;
                  }
               }
          }
         } 
         
         else if (select == 4) { //4
           System.out.println("회원 목록");
           if (loginStatus == true) {
           System.out.println(Arrays.toString(newId));   
           } else if (loginStatus == false) {
        	   System.out.println("로그인 후 이용해주십시오.");
           }
          } 
         
         else if (select == 5) { //5
            while (true) {
               System.out.println("프로그램을 종료 하시겠습니까? (y/n)");
               String exit = sc.next();   
               if (exit.equals("y")) {
                  System.out.println("로그아웃 성공. 프로그램을 종료합니다.");
                  System.exit(0);
               } 
               else if (exit.equals("n")) {
                  System.out.println("종료 취소");
                  break;
               }
            }
         } 
         
         else {
            System.out.println("제대로 된 번호를 작성해주세요."); //5<
         }
      }
   } 
}

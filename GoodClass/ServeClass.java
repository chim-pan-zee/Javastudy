package sec03.LoginSystem;

public class ServeClass {
	

	
	public static void main(String[] args) {
		 Movie mv = new Movie("기생충", "봉준호", 298);
		 System.out.println(mv.toString());
		 
		 Movie[] ms = new Movie[5];
		 
		 ms[0] = new Movie("엄준식일대기", "엄준식", 999);
		 ms[1] = new Movie("김종호일대기", "방국봉", 199);
		 ms[2] = new Movie("호날두", "로나르도", 299);
		 ms[3] = new Movie("디시인사이드", "ㅇㅇ", 399);
		 ms[4] = new Movie("밥을먹는자", "홀깅돌", 499);
		 
		 for(int i = 0; i < ms.length; i++) {
			 System.out.println("오늘볼영화는" + ms[i]);
		 }



		
	 }
}

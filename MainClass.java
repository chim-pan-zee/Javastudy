package sec03.LoginSystem;
public class MainClass {
	public static void main(String[] args) {
		ServeClass userinfo = new ServeClass("이름", "aad", "pass112", 99);
		System.out.println(userinfo.toString());
	}
}

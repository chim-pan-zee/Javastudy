package sec03.LoginSystem;

public class ServeClass {
	
	String name;
	String id;
	String password;
	int age;
	
	public ServeClass() {
		
	}
	
	public ServeClass(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public ServeClass(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ServeClass [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
}

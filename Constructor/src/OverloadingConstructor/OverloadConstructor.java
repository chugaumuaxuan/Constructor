package OverloadingConstructor;

public class OverloadConstructor {
	int id;
	String name;
	int age;
		
	public OverloadConstructor() {		
	}
	
	 OverloadConstructor(int i, String n){
		this.id = i;
		this.name = n;
	}
	
	 OverloadConstructor(int i, String n, int a){
		this.id = i;
		this.name = n;
		this.age = a;
	}
	
	

	void display() {
		System.out.println(id + name + age);
	}
	
	public static void main() {
		OverloadConstructor overload1 = new OverloadConstructor();
		OverloadConstructor overload2 = new OverloadConstructor();
		
		overload1.display();
		overload2.display();
		
	}
}

package CopyConstructor;

public class Copy {
	int id; 
	String name;
	
	Copy(){}
	
	Copy(int i, String n){			//Constructor 2 tham so
		this.id = i;
		this.name = n;
	}
	
	Copy(Copy s){			//Constructor
		id = s.id;
		name = s.name;
	}
	
	void display() {
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		Copy c1 = new Copy(1, "IT");
		Copy c2 = new Copy(c1);
		
		c1.display();
		c2.display();
		
	}
}

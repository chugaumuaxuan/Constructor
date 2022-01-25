package Constructor;

public class Book {
	String name;
	String author;
	
	Book(){} // Constructor khong tham so
	
	//Constructor co tham so		
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book sach1 = new Book(); //Tạo đối tượng mới
		sach1.setName("Rung Nauy");
		sach1.setAuthor("Murakami");
		
		System.out.println(sach1.getAuthor());
		System.out.println(sach1.getName());
		
	}

}

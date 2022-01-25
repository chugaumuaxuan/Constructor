package ThuTuChayCode;

public class LoadTest {
    public static void main(String[] args) {
        System.out.println("START");
        new Parent();
        System.out.println("END");
    }
}
 
class Parent extends Grandparent {
    {
        System.out.println("instance - parent");
    }
 
    public Parent() {
        System.out.println("constructor - parent");
    }
 
    static {
        System.out.println("static - parent");
    }
}
 
class Grandparent {
    static {
        System.out.println("static - grandparent");
    }
 
    {
        System.out.println("instance - grandparent");
    }
 
    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}
 




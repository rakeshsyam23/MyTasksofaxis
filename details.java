import java.util.Scanner;

class details {
    String name;
    private int id;
    String companyName;
    String place;
    protected int age;
    private String pos;
    
 public void createUser(details obj1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        obj1.name = sc.next();
        System.out.println("Enter the id: ");
        obj1.id = sc.nextInt();
        System.out.println("Enter the companyName: ");
        obj1.companyName = sc.next();
        System.out.println("Enter the place: ");
        obj1.place = sc.next();
        System.out.println("Enter the age: ");
        obj1.age = sc.nextInt();
        System.out.println("Enter the position: ");
        obj1.pos = sc.next();
}
public void display(){
    System.out.println("Enter the name : "+name);
    System.out.println("Enter the id : "+id);
    System.out.println("Enter the companyName : "+companyName);
    System.out.println("Enter the place : "+place);
    System.out.println("Enter the age : " +age);
    System.out.println("Enter the position : "+pos);
    System.out.println();
}
public static void main(String[] args){
        details obj1 = new details();
        obj1.createUser(obj1);
        obj1.display();
}
}
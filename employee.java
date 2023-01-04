import java.util.Scanner;

class employee{
    String empName;
    private String empId;
    String empcompanyName;
    String empPlace;
    protected int empAge;
    private String empPos;
public employee(String empName, String empId, String empcompanyName, String empPlace, int empAge, String empPos){
    this.empName = empName;
    this.empId = empId;
    this.empcompanyName = empcompanyName;
    this.empPlace = empPlace;
    this.empAge = empAge;
    this.empPos = empPos;
}
public void createUser(employee obj1){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        obj1.empName = sc.next();
        System.out.println("Enter the id: ");
        obj1.empId = sc.next();
        System.out.println("Enter the companyName: ");
        obj1.empcompanyName = sc.next();
        System.out.println("Enter the place: ");
        obj1.empPlace = sc.next();
        System.out.println("Enter the age: ");
        obj1.empAge = sc.nextInt();
        System.out.println("Enter the position: ");
        obj1.empPos = sc.next();
}
public void displayUser(){
    System.out.println("Enter the name : "+this.empName);
    System.out.println("Enter the id : "+this.empId);
    System.out.println("Enter the companyName : "+this.empcompanyName);
    System.out.println("Enter the place : "+this.empPlace);
    System.out.println("Enter the age : " +this.empAge);
    System.out.println("Enter the position : "+this.empPos); 
}
public static void main(String[] args){
    String empName;
    String empId;
    String empCompanyName;
    String empPlace;
    int empAge;
    String empPos;
    employee obj1 = new employee(empName = "Rakesh", empId = "Axis86", empCompanyName = "AxisBank", empPlace = "Mumbai", empAge = 23, empPos = "IT Manager");
    obj1.createUser(obj1);
    obj1.displayUser();
}
}



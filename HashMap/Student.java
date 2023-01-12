package HashMap;
import java.util.Scanner;

public class Student {
    String name;
	int rollNo;
	String college;
	String place;
	String branch;
	int sem;
	Scanner sc = new Scanner(System.in);


public Student(String name,int rollNo,String college,String place,String branch,int sem) {
	this.name = name;
	this.rollNo = rollNo;
	this.college = college;
	this.place = place;
	this.branch = branch;
	this.sem = sem;
	
    
}
public void display(){
	System.out.println("Student name : " +this.name);
	System.out.println("Student rollno : " +this.name);
	System.out.println("Student college : " +this.name);
	System.out.println("Student place : " +this.name);
	System.out.println("Student branch : " +this.name);
	System.out.println("Student sem : " +this.name);
}
public void update(){
	System.out.println("Enter student branch name to update: ");
	this.branch = sc.next();
}
}

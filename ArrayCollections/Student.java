package ArrayCollections;

import java.util.Scanner;

public class Student implements StudentInterface{
	String name = "";
	int age=0;
	String place="";
	String college="";
	
	int count = 0;
	
	Student arrayStudent[];
	
	Scanner sc = new Scanner(System.in);
	
public void addStudent() {
	if(count<arrayStudent.length) {
	Student obj1 = new Student();
	System.out.println("Enter the Student name : ");
	obj1.name = sc.next();
	System.out.println("Enter the student age :");
	obj1.age = sc.nextInt();
	System.out.println("Enter the Student place : ");
	obj1.place = sc.next();
	System.out.println("Enter the college name : ");
	obj1.college = sc.next();
	arrayStudent[count]=obj1;
	count++;
   }else {
	   System.out.println("Student obj can't inserted if the array is full");
	   }
   }
public void displayStudent() {
	for(Student obj : arrayStudent) {
		if(obj!=null) {
		System.out.println("Enter the Student Name : "+obj.name);
		System.out.println("Enter the Student age : "+obj.age);
		System.out.println("Enter the Student place : "+obj.place);
		System.out.println("Enter the Student college : "+obj.college);
	}

}
}
}



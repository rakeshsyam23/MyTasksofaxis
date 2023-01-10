package MultilevelInheritance;

import java.util.Scanner;


public class Student extends Branch{
	String studentName;
	String studentPlace;
	int studentId;

	public Student(String studentName,String studentPlace,int studentId, String branchName,int branchId, int branchTotalStaff, String collegeName, int collegeId,
			String collegePlace) {
		super(branchName, branchId, branchTotalStaff, collegeName, collegeId, collegePlace);
		this.studentName = studentName;
		this.studentPlace = studentPlace;
		this.studentId = studentId;
		
		
}
	public void showStudentDetails() {
		System.out.println("Enter the student name : "+this.studentName);
		System.out.println("Enter the student place : "+this.studentPlace);
		System.out.println("Enter the student id : "+this.studentId);
	}
	public void showAllDetails() {
		System.out.println("Enter the student name : "+studentName);
		System.out.println("Enter the student place : "+studentPlace);
		System.out.println("Enter the student id : "+studentId);
		System.out.println("Enter the college name : "+collegeName);
		System.out.println("Enter the branch name : "+branchName);

		
	}
	public void showCollege() {
		System.out.println("Enter the college name : "+collegeName);
		System.out.println("Enter the student place : "+collegePlace);
		System.out.println("Enter the student id : "+collegeId);
		
	}
	public void branchDetails() {
		System.out.println("Enter the branch name : "+branchName);
		System.out.println("Enter the branch Id : "+branchId);
		System.out.println("Enter the branch Total staff : "+branchTotalStaff);
	}
	public static void main(String[] args) {
		Student obj1Student = new Student("Rakesh", "Amalapuram", 586, "CSE", 500, 21, "BVC College", 18221, "Odalarevu");
		obj1Student.showAllDetails();
		obj1Student.showCollege();
		obj1Student.branchDetails();
	}
}


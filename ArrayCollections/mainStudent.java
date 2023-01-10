package ArrayCollections;
import java.util.Scanner;
public class mainStudent {

	public static void main(String[] args) {
		Student obj1 = new Student();
		System.out.println("Enter the Size of array : ");
		int n = obj1.sc.nextInt();
		obj1.arrayStudent = new Student[n];
		while(true) {
			System.out.println("Enter case\n 1:addStudent\n 2:display\n 3exit\n");
			int choice = obj1.sc.nextInt();
			switch(choice){
			case 1:
				obj1.addStudent();
				break;
			case 2:
				obj1.displayStudent();
				break;
			case 3:
				System.exit(1);
			}
		}
	

	}

}

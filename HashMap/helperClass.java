package HashMap;
import java.util.HashMap;
import java.util.Scanner;
public class helperClass{
        HashMap<Integer, Student>map = new HashMap<Integer, Student>();
        Scanner sc = new Scanner(System.in);
        void AddStudent(){
            System.out.println("Enter Student Details in order");
            System.out.println("Enter Student name: ");
            String name = sc.next();
            System.out.println("Enter Student rollno: ");
            int rollno = sc.nextInt();

            System.out.println("Enter Student place: ");
            String place = sc.next();

            System.out.println("Enter Student college: ");
            String college = sc.next();

            System.out.println("Enter Student branch: ");
            String branch = sc.next();

            System.out.println("Enter Student sem: ");
            int sem = sc.nextInt();

            while(map.containsKey(rollno)){
               System.out.println("Roll number is not unique");
               System.out.println("Enter mew Roll number: ");
            
        }
            Student std = new Student(name, rollno, place, college, branch, sem);
            map.put(rollno, std);
}
     void SearchStudent(){
            System.out.println("Enter student Roll number to search "); 
            int rollno = sc.nextInt();
            if(map.containsKey(rollno)){
                    map.get(rollno).display();
            }else{
                    System.out.println("Student Roll number is not there");
            }

    }
     void DeleteStudent(){
            System.out.println("enter student roll number to delete");
            int rollno = sc.nextInt();
            Student std = map.remove(rollno);
            if(std != null){
                    System.out.println("Delete student Details");
                    std.display();
            }else{
                    System.out.println("rollno is not found");
            }

    }
    public void UpdateStudent(){
            System.out.println("Enter student Roll number to update");
            int rollno = sc.nextInt();
            if(map.containsKey(rollno)){
                    Student std = map.get(rollno);
                    std.update();
                    map.replace(rollno, std);
            }
    }

       
public static void main(String[] args){
        helperClass obj1  = new helperClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Portal");
        while(true){
                System.out.println("1: AddStudent\n 2: SearchStudent\n 3: DeleteStudent 4: UpdateStudent\n 5: exit");
                int choice = sc.nextInt();
                switch(choice){
                        case 1: obj1.AddStudent(); 
                        break;
                        case 2: obj1.SearchStudent();
                        break;
                        case 3: obj1.DeleteStudent();
                        break;
                        case 4: obj1.UpdateStudent();
                        break;
                        case 5:
                        System.exit(1);

                }
                
        }
 
}
}



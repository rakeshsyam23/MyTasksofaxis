package inheritance;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the loan : ");
        int loan = sc.nextInt();
        bankChild obj1 = new bankChild();
        obj1.checkLoan();
        obj1.totalInterest();

    }
}

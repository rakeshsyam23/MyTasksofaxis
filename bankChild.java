package inheritance;
import java.util.Scanner;
public class bankChild extends BankParent{
    private static int bankTotalFund;
    String branchName;
    String branchId;
    long branchPhNo;
    private static int branchTotalFund;
    private static float branchInterest;
    public bankChild(int branchTotalFund,float branchInterest, int bankTotalFund,float bankInterest){
        super(branchTotalFund,bankInterest);
        this.branchTotalFund = branchTotalFund;
        this.branchInterest = branchInterest;

    }
    public float totalInterest(float branchInterest,float totalInterest,float bankInterest){
        return branchInterest+bankInterest;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the loan Amount : ");
        int loan = sc.nextInt();
        bankChild obj1 = new bankChild(bankTotalFund = 15000000, (float) 1.5, branchTotalFund = 1200000, branchInterest = 12);
        obj1.checkLoan(loan);
        obj1.totalInterest(loan, loan, loan);
       
        

}
}



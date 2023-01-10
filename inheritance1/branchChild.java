package inheritance1;

import java.util.Scanner;

public class branchChild extends bankParent{
	String branchName;
	String branchId;
	long branchphNo;
	private int branchTotalFund;
	private static float branchIntr;

	public branchChild (int bankTotalFund, float bankIntr, int branchTotalFund,float branchIntr) {
		super(bankTotalFund,bankIntr);
		this.branchIntr = branchIntr;
		this.branchTotalFund = branchTotalFund;
	}
	public void loan(int loan) {
		super.checkLoan(loan);
	}
		
public static void main(String[] args) {
	System.out.println("Enter the loan Amount : ");
	Scanner sc = new Scanner(System.in);
	int loan = sc.nextInt();
	branchChild obj1 = new branchChild(1000000000, 1.5f, 100000, 2.5f);
	obj1.loan(1000000);
	obj1.totalIntr(branchIntr);
	
}
	
	

}

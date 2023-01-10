package inheritance1;

public class bankParent {
	String name;
	String Id;
	long phNo;
	private int bankTotalFund;
	private float bankIntr;
	
public bankParent(int bankTotalFund,float bankIntr) {
	this. bankTotalFund =  bankTotalFund;
	this.bankIntr = bankIntr;
	
	
}
public bankParent() {
	
}
	
public void checkLoan(int loan) {
	if(loan<bankTotalFund) {
		System.out.println("Your loan is Approved : ");
	}else {
		System.out.println("Your loan is not Approved :");
	}
}
		void totalIntr(float branchIntr) {
			System.out.println("Your Total interest will be :"+branchIntr+this.bankIntr);
    }
}

package inheritance;
public class bankChild extends BankParent{
    String branchName;
    String branchId;
    long branchPhNo;
    private int branchTotalFund;
    private static float branchInterest;
    public bankChild(String branchName,String branchId, long branchPhNo, int branchTotalFund,float branchInterest,String bankName,String bankId,long bankPhNo, int bankTotalFund,float bankInterest){
        super(branchTotalFund,bankInterest);
        super.bankName = bankName;
        super.bankId = bankId;
        super.bankPhNo = bankPhNo;
        this.branchName = branchName;
        this.branchId = branchId;
        this.branchPhNo = branchPhNo;
        this.branchTotalFund = branchTotalFund;
        this.branchInterest = branchInterest;

    }

    @Override
    public void checkLoan(int loan) {

        super.checkLoan();

    }


}



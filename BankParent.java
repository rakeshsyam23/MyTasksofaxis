package inheritance;

public class BankParent {
    String bankName;
    String bankId;
    long bankPhNo;
    private int bankTotalFund;
    private float bankInterest;

    public BankParent(int bankTotalFund, float bankInterest) {
        this.bankTotalFund = bankTotalFund;
        this.bankInterest = bankInterest;
    }
    public BankParent(){

    }

    public void checkLoan(int loan, float branchInterest) {
        if (loan < bankTotalFund) {
            System.out.println("Loan is approved");
            totalInterest(branchInterest);
        }
   
        }


        }

    }


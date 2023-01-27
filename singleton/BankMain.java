package singleton;

public class BankMain {
	public static void main(String[] args) {
		BankSingleton obj = BankSingleton.getObject();
		obj.bankstatus(19);
	}

}

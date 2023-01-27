package singleton;

public class BankSingleton {
	private static BankSingleton bankobj = new BankSingleton();
	


private BankSingleton() {
}
static BankSingleton getObject() {
	return bankobj;
}
public void bankstatus(int time) {
	if(time >9 && time<18) {
		System.out.println("Bank is open");
	}else {
		System.out.println("Bank is not open");
	}
	

}
}

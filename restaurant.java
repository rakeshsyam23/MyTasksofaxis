
public class restaurant {
String food;
int orderId;
double price;
int quantity;

public restaurant() {
	 food = "Pizza";
	 orderId = 0;
	 price = 0;
	 quantity = 0;
}
public restaurant(String food,int orderId) {
	 food = "Pizza";
	 orderId = 251;
	 price = 0;
	 quantity = 0;
	 System.out.println("Enter the Food : "+food);
	 System.out.println("Enter the orderId : "+orderId);
	 
}
public restaurant(String food,int orderId,double price) {
	 food = "Pizza";
	 orderId = 251;
	 price = 599.99;
	 quantity = 0;
}
public restaurant(String food,int orderId,double price,int quantity) {
	 food = "Pizza";
	 orderId = 251;
	 price = 599.99;
	 quantity = 2;
}
public static void main(String[] args) {
	restaurant obj1 = new restaurant("Pizza",251);
	
}
}
	

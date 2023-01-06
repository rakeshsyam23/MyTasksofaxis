import java.util.Scanner;
public class RetailShopDetails implements Retail{

	@Override
	public float getTotalcost(float tax, float cost, float number) {
		float Totalcost = (cost*(1+(tax/100)))*number;
		return Totalcost;
	}

	@Override
	public float getTotalextendedcost(float cosmetics, float perfume, float clothes) {
		float Totalextendedcost = cosmetics+perfume+clothes;
		System.out.println("Enter the cost of items : "+Totalextendedcost);
		return Totalextendedcost;
	}

	@Override
	public void getTotalDiscount(float totalcost) {
		double TotalDiscount = (totalcost*(0.98));
		System.out.println("Enter the discounted price : "+TotalDiscount);
	}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("quantity of cosmetics : ");
	float cosmetics = sc.nextFloat();
	System.out.println("quantity of perfumes : ");
	float perfumes = sc.nextFloat();
	System.out.println("quantity of clothes : ");
	float clothes = sc.nextFloat();
	
	RetailShopDetails objretail = new RetailShopDetails();
	float Product1 = objretail.getTotalcost(7,10000,cosmetics);
	System.out.println("Total cost of cosmetics : "+cosmetics);
	float Product2 = objretail.getTotalcost(12,5000,perfumes);
	System.out.println("Total cost of perfumes : "+perfumes);
	float Product3 = objretail.getTotalcost(4,7000,clothes);
	System.out.println("Total cost of clothes : "+clothes);
	
	float totalcost = objretail.getTotalextendedcost(Product1,Product2,Product3);
	objretail.getTotalDiscount(totalcost);
	
	}
}
	


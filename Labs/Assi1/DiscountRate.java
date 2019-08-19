/** 
Course: JAC444
Kolodko
Adam
ahkolodko 027 980 127
SAB

This assignment represents my own work in accordance   with Seneca Academic Policy

Date: Oct/12/2017

Collection of customer discount values
Adam Kolodko
*/
class DiscountRate {
	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate(String type){
		switch (type){
			case "Premium":
				return serviceDiscountPremium;
			case "Gold":
				return serviceDiscountGold;
			case "Silver":
				return serviceDiscountSilver;
			default:
				return 0;
		}
	};
	public static double getProductDiscountRate(String type){
		switch (type){
			case "Premium":
				return productDiscountPremium;
			case "Gold":
				return productDiscountGold;
			case "Silver":
				return productDiscountSilver;
			default:
				return 0;
		}
	};
}
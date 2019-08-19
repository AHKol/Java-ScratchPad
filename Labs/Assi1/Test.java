/** 
Course: JAC444
Kolodko
Adam
ahkolodko 027 980 127
SAB

This assignment represents my own work in accordance   with Seneca Academic Policy

Date: Oct/12/2017

Tester for the DiscountRate, Visit, and Customer classes
Adam Kolodko

*/
import java.util.*;
class Test {
	public static void main(String[] args){
		
		//*************CUSTOMER TESTS*************
		//Customer constructor test
		Customer adam = new Customer("Adam");
		
		//getname test
		System.out.println(adam.getName());
		
		//ismember + setmember test
		if (!adam.isMember()){
			System.out.println("!adam.isMember()");
		}
		adam.setMember(true);
		if (adam.isMember()){
			System.out.println("adam.isMember()");
		}
		
		//getMemberType test
		System.out.println(adam.getMemberType());
		adam.setMemberType("Totaly a member");
		System.out.println(adam.getMemberType());
		
		//tostring test
		System.out.println(adam.toString());
		
		//************VISIT TESTS**************
		//visit constructor test
		Visit myvisit = new Visit("Adam", new Date());
		
		//getname test
		System.out.println(myvisit.getName());
		
		//get/set service expense test
		myvisit.setServiceExpense(100);
		System.out.println(DiscountRate.getServiceDiscountRate(adam.getMemberType()));
	}
	
}
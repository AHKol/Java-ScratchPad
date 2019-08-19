/** 
Course: JAC444
Kolodko
Adam
ahkolodko 027 980 127
SAB

This assignment represents my own work in accordance   with Seneca Academic Policy

Date: Oct/12/2017

Contains details related to a customer
Adam Kolodko
*/
public class Customer {
	String name;
	boolean member = false;
	String memberType;
	
	public Customer(String name){
		this.name = name;
	};
	public String getName(){
		return name;
	};
	public boolean isMember(){
		return member;
	};
	public void setMember(boolean member){
		this.member = member;
	};
	public String getMemberType(){
		return memberType;
	};
	public void setMemberType(String type){
		this.memberType = type;
	};
	public String toString(){
		return name + " " + memberType;
	};
}
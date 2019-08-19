/**
Course: JAC444
Kolodko
Adam
ahkolodko 027 980 127
SAB

This assignment represents my own work in accordance   with Seneca Academic Policy

Date: Oct/12/2017

Creates a customer or references one and adds a related visit record
Adam Kolodko
*/
import java.util.*;
public class Visit {
	Customer customer;
	Date date;
	double serviceExpense;
	double productExpense;
	
	public Visit(String name, Date date){
		customer = new Customer(name);
		this.date = date;
	};
	public String getName(){
		return customer.getName();
	};
	public double getServiceExpense(){
		return serviceExpense * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()));
	};
	public void setServiceExpense(double ex){
		serviceExpense = ex;
	};
	public double getProductExpense(){
		return productExpense * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
	};
	public void setProductExpense(double ex){
		productExpense = ex;
	};
	public double getTotalExpense(){
		return getServiceExpense() + getProductExpense();
	};
	public String toString(){
		return getName() + " " + getTotalExpense();
	};
}
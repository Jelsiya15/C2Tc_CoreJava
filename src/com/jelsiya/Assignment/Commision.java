package com.jelsiya.Assignment;

import java.util.Scanner;

/**
 * 
 */
public class Commision
{
	Scanner obj =new Scanner(System.in);
    String na,add;
    long  sales;
    float com;
    long ph;
    void getEmployeeDetail()
    {
		System.out.println("enter name:");
	    na=obj.next();
	    System.out.println("enter Address:");
	    add=obj.next();
	    System.out.println("enter salary:");
	    sales=obj.nextLong();
	    System.out.println("enter phone number:");
	    ph=obj.nextLong();
	    System.out.println("employee name"+na);
		System.out.println("employee Address"+add);
		System.out.println("employee sales"+sales);
		System.out.println("employee phone number"+ph);
    }
	 void calculateCommision()
	 {
	    if(sales>=100000)
	    {
			com=0.1f*sales;
			System.out.println("commision"+com);
		}
	    else if(sales<=50000 && sales<100000)
	    {
			com=0.05f*sales;
			System.out.println("commision"+com);
		 }
		 else if(sales<=30000 && sales<50000)
		 {
			  com=0.03f*sales;
			  System.out.println("commision"+com);
		 }
	/*	 else
		 {
			 System.out.println("no commision");
		 }*/
	}
	 public static void main(String[] args) {
		Commision co=new Commision();
		co.getEmployeeDetail();
        co.calculateCommision();
	}

}




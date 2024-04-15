package com.jelsiya.Assignment;
import java.util.*;

public class Detail {

	public static void main(String[] args) {
		
				Scanner obj =new Scanner(System.in);
		        String na;
		        int rollno;
		        float per;
		        char gr;
			    System.out.println("enter name:");
		        na=obj.next();
		        System.out.println("enter roll no:");
		        rollno=obj.nextInt();
		        System.out.println("enter grade");
		        gr=obj.next().charAt(0);
		        System.out.println("enter percentage:");
		        per=obj.nextFloat();
		        System.out.println("name:"+na);
		        System.out.println("roll no:"+rollno);
		        System.out.println("Grade:"+gr);
		        System.out.println("percentage"+per+"%");
			}
		
			
		


	}



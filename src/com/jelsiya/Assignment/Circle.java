package com.jelsiya.Assignment;
import java.util.Scanner;
public class Circle {
	     float radius;
	     String color;
	     Scanner ra =new Scanner(System.in);
	     public void getinput()
	     {
	    	 System.out.println("enter radius:");
	    	 radius=ra.nextFloat();
	    	 System.out.println("enter color:");
	    	 color=ra.next();
	     }
	     public void calarea()
	     {
	    	 float circlearea=3.14f*radius*radius;
	    	 System.out.println("the area is :"+circlearea);
	     }
	     public static void main(String args[])
	     {
	    	 Circle ca=new Circle();
	    	 ca.getinput();
	    	 ca.calarea();
	    	 
	     }
}





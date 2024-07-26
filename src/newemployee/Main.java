package newemployee;

import java.sql.*;
import java.util.*;
public class Main {

     public static void main(String[] args) throws Exception
     {
//ConnectionEstablishment.conn();
      Scanner sc=new Scanner(System.in);
      char ch='y';
      while(ch!='n')
      {
    	System.out.println("Employee details");
        System.out.println("1.Insert");
        System.out.println("2.delete ");
        System.out.println("3.Update");
        System.out.println("4.show");
        System.out.println("Enter your option");
        int op=sc.nextInt();
        if(op<5)
        {
         switch(op)
         {
           case 1:
               Operations.insert();
               break;
           case 2:
               Operations.delete();
               break;
           case 3:
                Operations.update();
                break;
           case 4:
                 Operations.show();
                 break;
         }
      }
      System.out.println("Are you want to continue(y/n)");
      ch=sc.next().charAt(0);
     }
  }

}





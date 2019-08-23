package com.cg.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.cg.dao.*;
import com.cg.bean.Order;
import com.cg.exception.OrderLessThanOne;
import com.cg.service.OrderServiceImpl;
import com.cg.service.Validator;;

public class MyOrder {

	public static void main(String[] args) throws IOException, OrderLessThanOne {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		OrderServiceImpl service=new OrderServiceImpl();
		String choice="";
		while(true)
		{
		System.out.println(" Menu ");
		System.out.println("================");
		System.out.println("1 Create/Save Order");
		System.out.println("2 Print all Order");
		System.out.println("3 Calculate Charges");
		System.out.println("4 CalculateOrder");
		System.out.println("5 exit");
		System.out.println("================");
		System.out.println("Enter your choice");
		choice=br.readLine();
		switch(choice)
		{
		case "1":long id=0;
                 double price=0d;
                 int quantity=0;
                 double amt=0.0;
                 double charges=0.0;
                 //Generate order id randomly
                 id=Long.parseLong((String.format("%.0f",Math.random()*1000)));

                 //Now Accept quantity and price and validate them 
                 
                 //Accepting and Validating Order id
                System.out.println("Enter Order price in  Dollars");
                while(true)
                {
              	String s_price=br.readLine();
              	boolean ch1=Validator.validatedata(s_price, Validator.pricepattern);
              	if(ch1==true)
              	{
              		try
              		{
              			price=Double.parseDouble(s_price);
              			price=price*75;
              			break;
              		}
              		catch(NumberFormatException e)
              		{
              			System.out.println("Order price must be Numeric. ReEnter");
              		}
              	}
              	else
              	{
              		System.out.println("ReEnter Order price");
              	}
                 }//end of order price while
                 
              //Accepting and Validating order quantity
                System.out.println("Enter Order quantity");
               while(true)
               {
             	String s_id=br.readLine();
             	boolean ch1=Validator.validatedata(s_id, Validator.quanpattern);
             	if(ch1==true)
             	{
             		try
             		{
             			quantity=Integer.parseInt(s_id);
             			
             			break;
             		}
             		catch(NumberFormatException e)
             		{
             			System.out.println("Order quantity must be Numeric. ReEnter");
             		}
             	}
             	else
             	{
             		System.out.println("ReEnter Order Quntity");
             	}
                }//end of orderquantity while
               
               //create an object of Order Class
               if(quantity<=0)
    			{
    				throw new OrderLessThanOne("Quantity can not be less than or equal to zero",quantity);
    			}
               else
               {
               Order o= new Order(id,price,quantity);
               service.saveOrder(o);
               }
               break;
		case "2":System.out.println("All Orders are");
		         service.display();
		         break;
		
		case "3":System.out.println("Enter the order id of order for which you want to calculate charges ");
		         long oid=Long.parseLong(br.readLine());
			     System.out.println("Currency Conversion Charges are");
			     Order ob=service.findOrder(oid);
		         System.out.println(service.calculateCharges(ob));
		         break;
		  
		case "4":System.out.println("Enter the order id of order for which you want to calculate total amount ");
                 oid=Integer.parseInt(br.readLine());
	             System.out.println("Currency Conversion Charges are");
	             ob=service.findOrder(oid);
			     System.out.println("Order Amount is");
			     System.out.println(service.calculateOrder(ob));
		         break;
		         
		case "5":System.out.println("System exiting");
		         System.exit(0);
		         break;
		default:System.out.println("Wrong choice");
		         

	}

}
}
}

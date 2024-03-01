package Hotel;

import java.util.Scanner;
public class Order
{
	public static void main(String[] args) 
	{
	 System.out.println("1.Squash\n2.Toast\n3.Tacos\n4.Herbed");
	 System.out.println(" ");
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter Option:");
	 int Option = s.nextInt();
	 
	 switch(Option)
	 {
	 case 1:
		 System.out.println("1.Truttle Squash-800rs");
		 System.out.println("2.Fish Squash-600rs");
		 System.out.println("3.Chicken Squash-700rs");
		 System.out.println(" ");
		 
		 System.out.println("Enter option: ");
		 int option1 = s.nextInt();
		 
		 switch(option1)
		 {
		 case 1:
			 System.out.println("Enter the quantity: ");
			 
			 int quantity1 = s.nextInt(); 
			 int item_price1 = 800;
			 int Total_bill1 = quantity1 * item_price1;
			 System.out.println("Total Bill:\n" +"Truttle Squash" +" " +quantity1 +" "+"x"+" "+item_price1+" "+"="+Total_bill1);
			 break;
			 
		 case 2:
			 System.out.println(" ");
             System.out.println("Enter the quantity : ");
			 
			 int quantity2 = s.nextInt();
			 int item_price2 = 600;
			 int Total_bill2 = quantity2 * item_price2;
			 System.out.println("Total Bill:\n" +"Fish Squash" +" " +quantity2 +" "+"x"+" "+item_price2+" "+"="+Total_bill2 );
			 break;
			 
		 case 3:
			 System.out.println(" ");
             System.out.println("Enter the quantity : ");
			 
			 int quantity3 = s.nextInt();
			 int item_price3 = 700;
			 int Total_bill3 = quantity3 * item_price3;
			 System.out.println("Total Bill:\n" +"Chicken Squash" +" " +quantity3 +" "+"x"+" "+item_price3+" "+"="+Total_bill3  );
			 break;
		 default:
			 System.out.println("Invalid Option...Selected from Menu");
		 }
		  break;
		 
		 
		  case 2:
		     System.out.println("1.Avo Toast-1000");
		     System.out.println("2.Berry Toast-650");
		     System.out.println("3.Orange Toast-500");
		 System.out.println(" ");
		 
		     System.out.println("Enter the option:");
		     int option2 = s.nextInt();
		     
		  switch(option2)
		   {
		   case 1:
			   System.out.println(" ");
		      System.out.println("Enter the quantity:");
			  
		      int quantity1 = s.nextInt();
		      int item_price1 = 1000;
		      int Total_bill1 = quantity1 * item_price1;
		      System.out.println("Total Bill:\n" +"Avo Toast" +" " +quantity1 +" "+"x"+" "+item_price1+" "+"="+Total_bill1 );
		      break;
		   case 2:
			   System.out.println(" ");
			   System.out.println("Enter the quantity:");
				  
			   int quantity2 = s.nextInt();
			   int item_price2 = 650;
			   int Total_bill2 = quantity2 * item_price2;
			   System.out.println("Total Bill:\n" +"Berry Toast" +" " +quantity2 +" "+"x"+" "+item_price2+" "+"="+Total_bill2);
			   break;
		   case 3:
			   System.out.println(" ");
			   System.out.println("Enter the quantity:");
				  
			   int quantity3 = s.nextInt();
			   int item_price3 = 500;
			   int Total_bill3 = quantity3 * item_price3;
			   System.out.println("Total Bill:\n" +"Orange Toast" +" " +quantity3 +" "+"x"+" "+item_price3+" "+"="+Total_bill3);
			   break;
		  default:
			   System.out.println("Invalid option...select from menu");
		   }
			   break;
		 
		 
	 case 3:
		 System.out.println("1.Chicken Tacos-400");
		 System.out.println("2.Lobster Tacos-750");
		 System.out.println("3.Prawns Tacos-550");
		 System.out.println(" ");
		 
		 System.out.println("Enter the option:");
	     int option3 = s.nextInt();
	     
	  switch(option3)
	   {
	   case 1:
		   System.out.println(" ");
	      System.out.println("Enter the quantity:");
		  
	      int quantity1 = s.nextInt();
	      int item_price1 = 400;
	      int Total_bill1 = quantity1 * item_price1;
	      System.out.println("Total Bill:\n" +"Chicken Tacos" +" " +quantity1 +" "+"x"+" " +item_price1 +" "+"="+" "+Total_bill1 );
	      break;
	   case 2:
		   System.out.println(" ");
		   System.out.println("Enter the quantity:");
			  
		   int quantity2 = s.nextInt();
		   int item_price2 = 750;
		   int Total_bill2 = quantity2 * item_price2;
		   System.out.println("Total Bill:\n" +"Lobster Tacos" +" " +quantity2 +" "+"x"+" "+item_price2+" "+"="+Total_bill2 );
		   break;
	   case 3:
		   System.out.println(" ");
		   System.out.println("Enter the quantity:");
			  
		   int quantity3 = s.nextInt();
		   int item_price3 = 550;
		   int Total_bill3 = quantity3 * item_price3;
		   System.out.println("Total Bill:\n" +"Prawns Tacos" +" " +quantity3 +" "+"x"+" "+item_price3+" "+"="+Total_bill3);
		   break;
	  default:
		   System.out.println("Invalid option...select from menu"); 
	   }
	   break;
	   
	  
	  
    case 4:
		 System.out.println("1.Herbed Chicken-450");
		 System.out.println("2.Herbed Fish-580");
		 System.out.println("3.Herbed Crab-690");
		 System.out.println(" ");
		 
		 System.out.println("Enter the option:");
	     int option4 = s.nextInt();
	     
	  switch(option4)
	   {
	   case 1:
		   System.out.println(" ");
	      System.out.println("Enter the quantity:");
		  
	      int quantity1 = s.nextInt();
	      int item_price1 = 450;
	      int Total_bill1 = quantity1 * item_price1;
	      System.out.println("Total Bill:\n" +"Herbed Chicken" +" " +quantity1 +" "+"x"+" "+item_price1+" "+"="+Total_bill1);
	      break;
	   case 2:
		   System.out.println(" ");
		   System.out.println("Enter the quantity:");
			  
		   int quantity2 = s.nextInt();
		   int item_price2 = 580;
		   int Total_bill2 = quantity2 * item_price2;
		   System.out.println("Total Bill:\n" +"Herbed Fish" +" " +quantity2 +" "+"x"+" "+item_price2+" "+"="+Total_bill2 );
		   break;
	   case 3:
		   System.out.println(" ");
		   System.out.println("Enter the quantity:");
			  
		   int quantity3 = s.nextInt();
		   int item_price3 = 690;
		   int Total_bill3 = quantity3 * item_price3;
		   System.out.println("Total Bill:\n" +"Herbed Crab" +" " +quantity3 +" "+"x"+" "+item_price3+" "+"="+Total_bill3);
		   break;
	   
	  default:
		   System.out.println("Invalid option...select from menu"); 
	   }
		   break;
	   
	   default:
		   System.out.println("Invalid option...select from menu");   
	  }
	
	 System.out.println(" ");
	 System.out.println("Do you want to Confirm your order?");
	 String str = s.nextLine();
	 System.out.println("Enter yes/no");
	 String r = s.nextLine();
	 
	 if(r.equals("yes"))
	 {
		 System.out.println("Enter address:");
	 	  String address = s.nextLine();
  	  System.out.println("Name:");
  	  String n = s.nextLine();
  	  System.out.println("Contact Number:");
  	  double number = s.nextDouble();
  	
	 
  	 System.out.println("Name:"+n+"\n"+"Contact Number:"+number+"\n"+"Address:"+address);
  	  
  	  System.out.println("order confirmed...\nThankyou");
	 }
	 else if(r.equalsIgnoreCase("no"))
	 {
		 System.out.println("Your order is cancelled");
	 }
	
	}

	}


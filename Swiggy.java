package relationship;

import java.util.Scanner;

public class Swiggy {
	
	Customer c;
	
	public void placeOrder(Customer c)
	{
		if(this.c==null)
		{
			this.c=c;
			System.out.println("Your order placed successfully....!");
			System.out.println("Order Id:"+ c.getOrderId());
			System.out.println("THANK YOU..!!\n");
		}
		else
		{
			System.out.println("You already placed order,\nif you want to change order, please cancel first order...\n");
		}
	}
	
	public void cancelOrder()
	{
		if(this.c==null)
		{
			System.out.println("You do not place order yet..\nfirst you have to place order.!\n");
		}
		else
		{
			this.c=null;
			System.out.println("Your order cancel successfully...!\n");
		}
	}
	
	public void OrderDetail()
	{
		if(this.c==null)
		{
			System.out.println("You do not place order yet..\nfirst you have to place order.!\n");
		}
		else
		{
			System.out.println("\nCustomer name: "+ c.getCname());
			System.out.println("Contact no.: "+ c.getCno());
			System.out.println("Customer Order: "+ c.getOrder());
			System.out.println("Restaurant name: "+ c.getHotel());
			System.out.println("Order Id: "+ c.getOrderId());
			System.out.println("Bill include 5% GST: "+ c.getOrderprice()+"\n");
		}
	}
	
	public void updateDetail()
	{
		if(this.c==null)
		{
			System.out.println("You do not place order yet..\nfirst you have to place order.!\n");
		}
		else
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter your choice to update:\n1. Customer Name \n2. Contact no. \n3. Hotel \n4. Order");
			int ch = s1.nextInt();
			
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter new customer name: ");
				String name = s1.next();
				c.setCname(name);
				System.out.println("updated...!");
			}
			break;
			case 2:
			{
				System.out.println("Enter new contact no.: ");
				long no = s1.nextLong();
				c.setCno(no);
				System.out.println("updated...!");	
			}
			break;
			case 3:
			{
				System.out.println("Select Restaurant from Following optins: \n1. Sham Restaurant \n2. Raju Hotel \n3. Baburao Da Dhaba ");
				int h = s1.nextInt();
				if(h==1)
				{
					String a ="Sham Restaurant";
					c.setHotel(a);
				}
				else if (h==2)
				{
					String b ="Raju Hotel";
					c.setHotel(b);
				}
				else
				{
					String p= "Baburao Da Dhaba";
					c.setHotel(p);
				}
				System.out.println("updated...!");
			}
			break;
			case 4:
			{   System.out.println("Now you can change your order");
				System.out.println("1. Pav Bhaji\n(price: 99.00)\n-------------\n2. Misal Pav\n(price: 120.50)\n------------- \n3. Aloo Paratha\n(price: 59.00)\n------------- \n4. VadaPav\n(price: 15.00)\n-------------\n5. Burger \n(price: 149.05)");
				int or=s1.nextInt();
				String od;
				long oi;
				double pr;
				if(or==1)
				{
					od="Pav Bhaji";
					oi=1234;
					pr=99.01;
				}
				else if(or==2)
				{
					od="Misal Pav";
					oi=6595;
					pr=120.50;
				}
				else if(or==3)
				{
					od="Aloo Paratha";
					oi=7845;
					pr=1001.11;
				}
				else if(or==4)
				{
					od="VadaPav";
					oi=1432;
					pr=15.00;
				}
				else 
				{
					od="Burger";
					oi=1478;
					pr=149.05;
				}
				c.setOrder(od);
				c.setOrderId(oi);
				c.setOrderprice(pr);
			}
			break;
			default :
			{
				System.out.println("You Enter wrong option.");
			}
			}
		}
	}
	
}

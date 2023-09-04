package relationship;

import java.util.Scanner;

public class SwiggyDriver {

	public static void main(String[] args) {
		
		Swiggy s1 = new Swiggy();
		Scanner i=new Scanner(System.in);
		
		boolean exit=true;
		do
		{
			System.out.println("----Welcom to Swiggy----");
			System.out.println("1. Place Order \n2. Cancel Order \n3. Placed order detail \n4. Update detail or order");
			int a=i.nextInt();
			switch(a)
			{
			case 1 :
			{
				System.out.println("Enter your name : ");
				String name=i.next();
				System.out.println("Enter your contact no. :");
				long cno=i.nextLong();
				System.out.println("---Today's Special---");
				System.out.println("1. Pav Bhaji\n(price: 99.00)\n-------------\n2. Misal Pav\n(price: 120.50)\n------------- \n3. Aloo Paratha\n(price: 59.00)\n------------- \n4. VadaPav\n(price: 15.00)\n-------------\n5. Burger \n(price: 149.05)");
				int or=i.nextInt();
				String od;
				long oi;
				double pr;
				if(or==1)
				{
					od="Pav Bhaji";
					oi=1234;
					pr=99.00;
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
					pr=59.00;
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
				
				
				System.out.println("Select Restaurant: \n1. Sham Restaurant \n2. Raju Hotel \n3. Baburao Da Dhaba");
				int hl=i.nextInt();
				String h;
				if(hl==1)
				{
					h="Sham Restaurant";
				}
				else if(hl==2)
				{
					h="Raju Hotel";
				}
				else
				{
					h="Baburao Da Dhaba";
				}
				
				s1.placeOrder(new Customer(name, cno, od, oi, pr, h));
			}
			break;
			case 2:
			{
				s1.cancelOrder();
			}
			break;
			case 3:
			{
				s1.OrderDetail();
			}
			break;
			case 4:
			{
				s1.updateDetail();
			}
			break;
			default:
			{
				System.out.println("You Enter Wronge Option, Try Again...");
			}
			}
			
		}
		while(exit);
	}

}

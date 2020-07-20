/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopd.assignment;

/**
 *
 * @author youn
 */
public class OOPDAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
		String name;
		
		System.out.println(".....Element.....");
		System.out.println(".....Menu.....");
		System.out.println("...1.Add Element.....");
		System.out.println("...2.Display Element.....");
		System.out.println("...3.Read File.....");
		System.out.println("...4.Write File...");
		System.out.println("...5.Exit...");
		System.out.println(".....");
		
		int option;
		System.out.println("Please enter your choise.");
		Scanner sc = new Scanner (System.in);
		Option = sc.nextInt();
		
		switch (option)
		{
		
		case 1:ElementInput();
		break;
		case 2:System.out.println("Display the selected Element");
		break;
		case 3:System.out.println("Read File");
		break;
		case 4:System.out.println("Write File");
		break;
		case 5:System.out.println("Exit");
		break;
		
		default:System.out.println("Please inputa valid selsction.");
		}
	}
	public static void Elementinput()
	{
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("please input Element name:   ");
		name = sc.next();
		System.out.println("The Element is "+ name);
		
			
		}
		
		
		
		
	}




        // TODO code application logic here
    }
    
}

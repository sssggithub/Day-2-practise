package day2;
import java.util.*;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner f=new Scanner(System.in);
System.out.print("Enter Number:");
int num=f.nextInt();
switch(num) {
case 1:
	System.out.println("Name of Month is January");
	break;
case 2:
	System.out.println("Name of Month is Fabuary");
case 3:
	System.out.println("Name of Month is March");
	break;
case 4:
	System.out.println("Name of Month is April");
	break;
case 5:
	System.out.println("Name of Month is May");
	break;
case 6:
	System.out.println("Name of Month is June");
	break;
case 7:
	System.out.println("Name of Month is July");
	break;
case 8:
	System.out.println("Name of Month is August");
	break;
case 9:
	System.out.println("Name of Month is September");
	break;
case 10:
	System.out.println("Name of Month is October");
	break;
case 11:
	System.out.println("Name of Month is November");
	break;
case 12:
	System.out.println("Name of Month is December");
	break;
	default:
		System.out.println("Enter number is Invalid");
}
	}

}

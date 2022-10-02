package day2;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.println("Enter Natural Number");
Scanner s=new Scanner(System.in);
System.out.print("sum from:");
int a=s.nextInt();
System.out.print("sum upto:");
int b=s.nextInt();
for(;a<=b;a++) {
	 sum=sum+a;
}
System.out.println("Sum of Natural Number:"+sum);
	}

}

package day2;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reminder = 0, reverse=0,y;
		Scanner f=new Scanner(System.in);
		System.out.println("Enter Number:");
		int number=f.nextInt();
		y=number;
		while(number!=0) {
			reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
		System.out.println("Reverse Number:"+reverse);
		if(y==reverse) {
			System.out.println("Its a pallindrome Number");
		}
		else {
			System.out.println("Its not a Pallondrome Number");
		}
	}

}

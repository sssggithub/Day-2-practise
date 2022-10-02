package day2;
import java.util.*;
public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner f=new Scanner(System.in);
System.out.println("Enter Day:");
int day=f.nextInt();
System.out.println("Enter Month:");
int month=f.nextInt();
if(month==3&&day>=20&&day<=31) {
	System.out.println("Month and Date is True");
}
else if(month==4&&day>=1&&day<=30) {
	System.out.println("Month and Date is True");
}
else if(month==5&&day>=1&&day<=31) {
	System.out.println("Month and Date is True");
}
else if(month==6&&day<=20) {
	System.out.println("Month and Date is True");
}
else {
	System.out.println("Month and Date is False");
}
	}

}

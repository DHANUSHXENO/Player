import java.util.Scanner;
public class PrintNext20LeapYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the current year");
		int year=sc.nextInt();
		int i;
		int flag=0;
		for(i=year;;i++) {
			if( ( (i%4==0) && (i%100!=0) ) || (i%400==0) ) {
				if(flag==0) {
					System.out.println("The next 20 leap years are :");
				}
				++flag;
				if(flag==20) {
					break;
				}
				System.out.print(i + " ");				
			} 
		}
		sc.close();
	}
}

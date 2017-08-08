import java.util.Scanner;
public class SumOfDigWithEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer");
		int num=sc.nextInt();	
		int ans=0;
		int i;
		for(i=0;i<num+"".length();i++) {
			int digit=num%10;
			if(digit%2==0) {
				ans=ans+digit;
			}
			num=num/10;
		}
		System.out.println("Even sum : "+ans);
		sc.close();
	}
}

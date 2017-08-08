import java.util.Scanner;
public class SumOfDigWithEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the digits");
		int i;
		int sum=0;
		for(i=0;i<n;i++) {
			int num=sc.nextInt();
			if(num%2==0) {
				sum=sum+num;
			}
		}
		System.out.println("Even sum : "+sum);
		sc.close();
	}
}

import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal");
		float p=sc.nextFloat();
		System.out.println("Enter Number of Years");
		float n=sc.nextFloat();
		System.out.println("Enter Rate of Interest");
		float r=sc.nextFloat();
		System.out.println("Simple Interest "+(p*n*r)/100);

	}

}

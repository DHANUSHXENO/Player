import java.util.Scanner;
public class AddFirstLastDigitOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String str=new String(num+"");
		int sum=Integer.parseInt(str.charAt(0)+"")+Integer.parseInt(str.charAt(str.length()-1)+"");
		System.out.println(sum);
	}
}

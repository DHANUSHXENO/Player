import java.util.Scanner;
public class PrintNum1toNUsingRecursion {
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(print(n));
		sc.close();
	}
	static String print(int n) {
		if(i==n)
			return "";
		else
			return (++i)+" "+print(n);
	}

}

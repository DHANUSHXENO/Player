import java.util.Scanner;
public class PrintHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of steps");
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

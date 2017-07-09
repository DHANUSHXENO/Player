import java.util.Scanner;
public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(k=j-2;k>=1;k--) {
				System.out.print(k);
			}
			System.out.print(" ");
		}
		

	}

}
/* n=4 1 121 12321 1234321 */
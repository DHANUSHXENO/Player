package player;
import java.util.Scanner;
public class PrintUniqueElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int i,j;
		char out[]=new char[n];
		for(i=0;i<n;i++) {
			out[i]=sc.next().charAt(0);
		}
		int flag=0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(out[i]==out[j] && i!=j) {
					++flag;
					break;
				}
			}
			if(flag==0) {
				System.out.print(out[i]+" ");
			}
			flag=0;
		}
	}
}

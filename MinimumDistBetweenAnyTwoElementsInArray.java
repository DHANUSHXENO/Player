package player;
import java.util.Scanner;
public class MinimumDistBetweenAnyTwoElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int i,j;
		int max=999999;
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int num1=0;
		int num2=0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(Math.abs(arr[i]-arr[j])<max && i!=j){
					max=Math.abs(arr[i]-arr[j]);
					num1=arr[i];
					num2=arr[j];
				}
			}
		}
		if(num1!=999999) {
			System.out.println("The minimum difference is "+max+" between "+num1+" and "+num2);
		}		
		sc.close();
	}
}

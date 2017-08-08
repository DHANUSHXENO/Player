import java.util.Scanner;
public class BitonicArrayMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int i;
		System.out.println("Enter elements of Bitonic Array");
		//Element increases upto a point and then decreases is called BITONIC ARRAY
		int arr[]=new int[n];
		int temp=0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("Maximum Element "+temp);
		sc.close();
	}
}

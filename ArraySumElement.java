import java.util.Scanner;
public class ArraySumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter size");
		int size=sc.nextInt();
		int i,j;
		int arr[]=new int[size];
		System.out.println("Enter elements");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Ënter the element x");
		int x=sc.nextInt();
		int count=0;
		int t1=0;
		int t2=0;
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				if(arr[i]+arr[j]==x && i!=j) {
					t1=arr[i];
					t2=arr[j];
					++count;
					break;
				}
			}
			if(count>0) {
				break;
			}
		}
		if(count!=0)
			System.out.println("Element in array "+t1+" and "+t2+" sum upto "+x);
		else
			System.out.println("No element sum is "+x);

	}

}

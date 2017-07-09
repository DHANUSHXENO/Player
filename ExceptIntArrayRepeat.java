import java.util.Scanner;
public class ExceptIntArrayRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int i,j;
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				if(arr[i]==arr[j] &&  i!=j) {
					++count;
				}
			}
			if(count==0)
			{
				System.out.println("Element that appears once is "+arr[i]);
			}
			count=0;
		}
		sc.close();
	}
}

import java.util.Scanner;
public class FindDifferentOddOrEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int i;
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		int count1=0;
		int count2=0;
		int t1=0;
		int t2=0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				++count1;
				t1=arr[i];
			}
			else {
				++count2;
				t2=arr[i];
			}
		}
		sc.close();
		if(count1>count2) {
			System.out.println(t2+"  is the different number");
		}
		else {
			System.out.println(t1+" is the different number");
		}
	}
}

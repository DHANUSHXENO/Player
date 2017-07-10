import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
public class IntegerNumAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!='\0') {
			int a=n%10;
			ts.add(a);
			n=n/10;
		}
		Iterator<Integer> it=ts.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		sc.close();
	}

}

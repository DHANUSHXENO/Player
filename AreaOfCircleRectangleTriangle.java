import java.util.Scanner;
public class AreaOfCircleRectangleTriangle {
	static Scanner sc=new Scanner(System.in);
	static float length;
	static float breadth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculate Area of ??\n1)Circle\n2)Rectangle\n3)Triangle");
		int select;
		do
		{
		System.out.println("Enter your choice");
		select=sc.nextInt();
		if(select==1) {
			Circle();
		}
		else if(select==2) {
			Rectangle();
		}
		else if(select==3) {
			Triangle();
		}
		else {
			System.out.print("Invalid Selection(Exit)");
			break;
		}
		}while(select!='\0');
	}
	public static void Circle() {
		System.out.println("Enter radius");
		float radius=sc.nextInt();
		System.out.println("Area of Circle "+3.14*radius*radius);
	}
	public static void Rectangle() {
		calc();
		System.out.println("Area of Rectangle "+length*breadth);
	}
	public static void Triangle() {
		calc();
		System.out.println("Area of Triangle "+ (length*breadth)/2);
	}
	public static void calc() {
		System.out.println("Enter length");
		length=sc.nextInt();
		System.out.println("Enter breadth");
		breadth=sc.nextInt();
	}
}

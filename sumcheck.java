import java.util.Scanner;
public class sum{

	public static void main(String[] args){
        int sum = 0;
	    int a,b,c;
		Scanner sc= new Scanner(System.in);

		System.out.print("enter the first number: ");

		a = sc.nextInt();

		System.out.print("enter the second number: ");

		b = sc.nextInt();

		System.out.print("enter the third number: ");

		c = sc.nextInt();
	
		sum = a+b+c;
		if(sum>=45){
			System.out.print("true,no change: ");

		}else{
			int sub = a-b-c;
			System.out.print("subtractio = "+sub);
		}
	}
}
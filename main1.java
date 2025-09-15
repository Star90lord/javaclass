import java.util.Scanner;
public class main1 {
	int a,b;
	void getdata() {
		Scanner sc = new Scanner(System.in);
		
		System.err.println("enter the numbers: ");
		a = sc.nextInt();
		System.out.println("enter the number 2: ");
		b = sc.nextInt();
	}
	void putdata() {
		System.err.println("addition: "+(a+b));
	}
}

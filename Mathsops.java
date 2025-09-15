import java.util.Scanner;
public class Mathsops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the first integer:\t");
		int num1 = input.nextInt();
		
		System.out.println("enter the second number:\t");
		int num2 = input.nextInt();
		
		System.out.println("num1+num2 =\t"  +(num1+num2));
		
		input.close();
		
		}
}

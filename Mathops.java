import java.util.Scanner;
public class Mathops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter your name:");
		
		String name = input.nextLine();
		
		System.out.print("enter your age:");
		int age = input.nextInt();
		
		System.out.print("hello\t" +name+ "\tyour age is\t" +age+ "years old\t");
		input.close();
	}

}

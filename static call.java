import java.util.Scanner;
public class Main{
    public static int sumcheck(int a,int b,int c){
    int sum = 0;
    sum = a+b+c;
    if(sum>=45){
        System.out.println("no changes");
        return sum;
        
    }else{
        int sub = a-b-c;
        System.out.println("sub"+sub);
        return sub;
    }
}
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the first number: ");
       int a = sc.nextInt();
       System.out.print("enter the second number: ");
       int b = sc.nextInt();
       System.out.print("enter the third number: ");
       int c = sc.nextInt();
       int res = sumcheck(a,b,c);
       System.out.println("sumcheck" +"\t"+ +res);
       sc.close();
	}
}
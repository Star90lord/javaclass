class suminherit{
	int a= 10;
	int b = 20;
	int c = 10;
	void sum(){
		int sum = a+b+c;
		System.out.println("sum = "+sum);	
	}
}

class child extends suminherit{
	void check(){
		int total  = a+b+c;
		if(total>=45){
			System.out.println("true");

        }else{
	        int subtract =a-b-c; 
	        System.out.println("sub"+subtract);
        }

    }
}

public class Main{
	public static void main(String[] args){
		child chil = new child();
		chil.check();
    }
}

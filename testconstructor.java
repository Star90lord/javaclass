package caller;

class test{
	public void tester(){
		System.out.println("hii from contructor");
	}
	
	public void tester(int a){
		System.out.println("hii from contructor 2nd"+a);
	}
	
}

public class testconstructor{
	public static void main(String[] args) {
		test tester = new test();
		tester.tester();
		tester.tester(10);
	}
}

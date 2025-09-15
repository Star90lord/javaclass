package caller;

class parent{
	public void add(int a) {
		System.out.println(a+a);
	}
}

class child extends parent{
	public void product(int a) {
		System.out.println(a*a);
	}
}



public class testinherit {

	public static void main(String arg[]) {
		parent parent = new parent();
		parent.add(10);
		child child = new child();
		child.product(4);
		child.add(5);
	}

}

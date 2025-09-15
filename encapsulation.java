class altamash{
	protected int salary;
	private int age = 19;
	public String name = "Altamash";
	public int getter() {
		return age;
	}
	
	public void setter(int salary) {
		this.salary = salary;
	}
	public void greet(){
		System.out.println("my name is:" +name);
	}
	 public int getsalary() {
		 return salary;
	 }
	
	public void addage(int a) {
		System.out.println(19+a);
	}
}



public class encapsulation {
	public static void main(String[] arg) {
		altamash g  = new altamash();
		
		g.greet();
		g.setter(123654898);
		System.out.println(g.getsalary());
		g.addage(3);
	}	
}

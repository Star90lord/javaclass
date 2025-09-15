class suminherit{
	int a= 10;
	int b = 20;
	int c = 10;
	void sum(){
		int sum = a+b+c;
		System.out.println("sum = "+sum)	
	}
}

class child extends suminherit{
	void check{
		int total  = a+b+c;
		if(total>=45){
			System.out.println("true");

}else{
	sutract =a-b-c; 
	System.out.pritln("sub"+subtract)
}		
}
}

class Main{
	pulic static void main(Strings[] args){
		child chil = new child();
		chil.check();
}
}

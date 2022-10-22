package hello;

public class task1 {

	public static void main(String[] args) {
		
		Customer obj=new Customer();
		 obj.name="adel";
		 obj.customerNum= 20;
		 obj.age=30;
		 obj.adress="1 Cty W20";
		 
		 obj.printOutput();
		 obj.welcome();
		 System.out.println("");
		 obj.name="lamiaa";
		 obj.customerNum= 25;
		 obj.age=34;
		 obj.adress="2 Cty W20";
		 
		 obj.printOutput();
		 obj.welcome();
		 
		
		 System.out.println(" ");	
	
		product obj1=new product();
		obj1.name="juice";
		obj1.code=123;
		obj1.price=5 ;
		
		obj1.printOutput();
		 System.out.println(" ");
		 
		employee obj2=new employee ();
		obj2.name="Ahmed";
		obj2.numOfEmployee=111;
		obj2.age=36;
		obj2.adress="gfct2";
		obj2.printOutput();
		obj2.welcome();
			
		
		

	}

}

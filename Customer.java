package hello;

public class Customer {
	String name;
    int customerNum;
    int age;
    String adress;

    public void printOutput() {
    	System.out.println("name : "+name);
        System.out.println("num of customer : "+customerNum);
        System.out.println("age : "+age);
        System.out.println("adress : "+adress);
    }
        public void welcome ()	{
          System.out.println("Hi,"+name);
}
        
}
package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args)  {
		
		//BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.save(new Customer(1, "Kaan", "Hacýömeroðlu", 1999, 68788106116L));
		
		System.out.println();
		
		
	}

}

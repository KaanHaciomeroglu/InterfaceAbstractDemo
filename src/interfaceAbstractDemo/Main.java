package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args)  {
		
		//BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.save(new Customer(1, "Kaan", "Hac��mero�lu", 1999, 68788106116L));
		
		System.out.println();
		
		
	}

}

package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args)  {
		
		//BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//Tc Long girilecek
		customerManager.save(new Customer(1, "Kaan", "Hacýömeroðlu", 1999, L));
		
		System.out.println();
		
		
	}

}

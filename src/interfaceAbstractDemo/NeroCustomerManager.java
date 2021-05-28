package interfaceAbstractDemo;

public class NeroCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService _customerCheckService;
	
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		_customerCheckService = customerCheckService;
		
	}

	public void save(Customer customer) {

		if (_customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
		} else
			System.out.println("Geçerli Giriþ Yapýlmadý");

	}
	

}

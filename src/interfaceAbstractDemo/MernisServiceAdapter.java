package interfaceAbstractDemo;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{
	
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(), customer.getLastName(), customer.getDateTime());
		}catch(NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
	return false;
	}
  
		
	}


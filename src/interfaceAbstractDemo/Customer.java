package interfaceAbstractDemo;

public class Customer implements IEntity {
	public int id;
	public String firstName;
	public String lastName;
	public int dateTime;
	public long NationalityId;

	public Customer(int id, String firstName, String lastName, int dateTime, long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateTime = dateTime;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName.toUpperCase();
	}

	public String getLastName() {
		return lastName.toUpperCase();
	}

	public int getDateTime() {
		return dateTime;
	}

	public long getNationalityId() {
		return NationalityId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateTime(int dateTime) {
		this.dateTime = dateTime;
	}

	public void setNationalityId(long nationalityId) {
		NationalityId = nationalityId;
	}

}

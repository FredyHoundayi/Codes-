package annuaire_tel;

public class Contact {
	//Attributs
	
	private String firstname;
	private String name;
	private String phonenumber;
	public Contact ( String firstname,String name,String phonenumber){
		this.firstname=firstname;
		this.name=name;
		this.phonenumber=phonenumber;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
    
	@Override
	public String toString() {
		return this.firstname + this.name + this.phonenumber;
	}

}

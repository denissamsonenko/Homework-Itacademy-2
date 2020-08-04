package by.htp.les02.entity;

public class User {
	private final String FIRSTNAME;
	private final String SURNAME;
	private final String PASSWORD;
	private final String EMAIL;
	private final String AGE;
	private final String ID;
	private final String ADDRESS;
	private final String CITY;
			
private User(UserBuilder builder) {
		this.FIRSTNAME = builder.firstName;
		this.SURNAME = builder.surname;
		this.PASSWORD = builder.password;
		this.EMAIL = builder.eMail;
		this.AGE = builder.age;
		this.ID = builder.id;
		this.ADDRESS = builder.address;
		this.CITY = builder.city;
	}

public String getFIRSTNAME() {
	return FIRSTNAME;
}

public String getSURNAME() {
	return SURNAME;
}

public String getPASSWORD() {
	return PASSWORD;
}

public String getEMAIL() {
	return EMAIL;
}

public String getAGE() {
	return AGE;
}

public String getID() {
	return ID;
}

public String getADDRESS() {
	return ADDRESS;
}

public String getCITY() { 
	return CITY; 
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ADDRESS == null) ? 0 : ADDRESS.hashCode());
	result = prime * result + ((AGE == null) ? 0 : AGE.hashCode());
	result = prime * result + ((CITY == null) ? 0 : CITY.hashCode());
	result = prime * result + ((EMAIL == null) ? 0 : EMAIL.hashCode());
	result = prime * result + ((FIRSTNAME == null) ? 0 : FIRSTNAME.hashCode());
	result = prime * result + ((ID == null) ? 0 : ID.hashCode());
	result = prime * result + ((PASSWORD == null) ? 0 : PASSWORD.hashCode());
	result = prime * result + ((SURNAME == null) ? 0 : SURNAME.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (ADDRESS == null) {
		if (other.ADDRESS != null)
			return false;
	} else if (!ADDRESS.equals(other.ADDRESS))
		return false;
	if (AGE == null) {
		if (other.AGE != null)
			return false;
	} else if (!AGE.equals(other.AGE))
		return false;
	if (CITY == null) {
		if (other.CITY != null)
			return false;
	} else if (!CITY.equals(other.CITY))
		return false;
	if (EMAIL == null) {
		if (other.EMAIL != null)
			return false;
	} else if (!EMAIL.equals(other.EMAIL))
		return false;
	if (FIRSTNAME == null) {
		if (other.FIRSTNAME != null)
			return false;
	} else if (!FIRSTNAME.equals(other.FIRSTNAME))
		return false;
	if (ID == null) {
		if (other.ID != null)
			return false;
	} else if (!ID.equals(other.ID))
		return false;
	if (PASSWORD == null) {
		if (other.PASSWORD != null)
			return false;
	} else if (!PASSWORD.equals(other.PASSWORD))
		return false;
	if (SURNAME == null) {
		if (other.SURNAME != null)
			return false;
	} else if (!SURNAME.equals(other.SURNAME))
		return false;
	return true;
}

@Override
public String toString() {
	return "User [firstName=" + FIRSTNAME + ", surname=" + SURNAME + ", password=" + PASSWORD + ", eMail=" + EMAIL
			+ ", age=" + AGE + ", id=" + ID + ", address=" + ADDRESS + ", city=" + CITY + "]";
}


public static class UserBuilder {
	private String firstName;
	private String surname;
	private String password;
	private String eMail;
	private String age;
	private String id;
	private String address;
	private String city;
	
	public UserBuilder() {

	}

	public UserBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserBuilder surname(String surname) {
		this.surname = surname;
		return this;
	}

	public UserBuilder password(String password) {
		this.password = password;
		return this;
	}

	public UserBuilder eMail(String eMail) {
		this.eMail = eMail;
		return this;
	}

	public UserBuilder age(String age) {
		this.age = age;
		return this;
	}

	public UserBuilder id(String id) {
		this.id = id;
		return this;
	}

	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}

	public UserBuilder city(String city) {
		this.city = city;
		return this;
	}
	
	public User build() {
		return new User(this);
	}
}
}

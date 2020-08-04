package by.htp.les02.entity;

public class User {
	private String firstName;
	private String surname;
	private String password;
	private String eMail;
	private String age;
	private String id;
	private String address;
	private String city;
			
private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.surname = builder.surname;
		this.password = builder.password;
		this.eMail = builder.eMail;
		this.age = builder.age;
		this.id = builder.id;
		this.address = builder.address;
		this.city = builder.city;
	}

public String getFirstName() {
	return firstName;
}

public String getSurname() {
	return surname;
}

public String getPassword() {
	return password;
}

public String geteMail() {
	return eMail;
}

public String getAge() {
	return age;
}

public String getId() {
	return id;
}

public String getAddress() {
	return address;
}

public String getCity() { 
	return city; 
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((age == null) ? 0 : age.hashCode());
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (age == null) {
		if (other.age != null)
			return false;
	} else if (!age.equals(other.age))
		return false;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (eMail == null) {
		if (other.eMail != null)
			return false;
	} else if (!eMail.equals(other.eMail))
		return false;
	if (firstName == null) {
		if (other.firstName != null)
			return false;
	} else if (!firstName.equals(other.firstName))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (surname == null) {
		if (other.surname != null)
			return false;
	} else if (!surname.equals(other.surname))
		return false;
	return true;
}

@Override
public String toString() {
	return "User [firstName=" + firstName + ", surname=" + surname + ", password=" + password + ", eMail=" + eMail
			+ ", age=" + age + ", id=" + id + ", address=" + address + ", city=" + city + "]";
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

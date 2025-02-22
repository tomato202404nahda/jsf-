package hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	private String firstName;
	private String lastName;
	private String country;
	
	List<String> countryOptions;
	
	
	public StudentTwo() {
		
		countryOptions = new ArrayList<>();
		countryOptions.add("Brazil");
		countryOptions.add("Indonesia");
		countryOptions.add("Germany");
		countryOptions.add("Philippines");
		countryOptions.add("Greece");
		countryOptions.add("United States");
		countryOptions.add("United Kingdom");
		
	}


	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
}

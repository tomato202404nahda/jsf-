package hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class StudentThree {
	private String firstName;
	private String lastName;
	private String programmingLanguage;
	
	
	private List<String> programmingLanguageOptions;
	
	public StudentThree(){
		
		programmingLanguageOptions = new ArrayList<>();
		programmingLanguageOptions.add("Zig");
		programmingLanguageOptions.add("Nim");
		programmingLanguageOptions.add("Rust");
		programmingLanguageOptions.add("C++");
		programmingLanguageOptions.add("Java");
		programmingLanguageOptions.add("C");
		
		
		
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

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public List<String> getProgrammingLanguageOptions() {
		return programmingLanguageOptions;
	}
	
	
	
}

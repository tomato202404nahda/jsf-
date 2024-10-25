package hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class StudentFour {
	private String firstName;
	private String lastName;
	private String[] programmingLanguages;
	
	
	private List<String> programmingLanguageOptions;
	
	public StudentFour(){
		
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



	public String[] getProgrammingLanguages() {
		return programmingLanguages;
	}

	public void setProgrammingLanguages(String[] programmingLanguages) {
		this.programmingLanguages = programmingLanguages;
	}

	public List<String> getProgrammingLanguageOptions() {
		return programmingLanguageOptions;
	}
	
	
	
}

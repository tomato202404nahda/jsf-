package hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	private String firstName;
	private String lastName;
	
	
	//引数なしコンストラクタ
	public Student() {
		
	}


	//セッターとゲッター
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
	
	

}

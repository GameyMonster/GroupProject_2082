package College;

import java.io.Serializable; 
//import java.util.Scanner;

public class CreatingPasswordUsername implements Serializable{
	private String password,username,backWordName = "";
	private int lengthPassword;
	private String firstName,lastName,email,address,phoneNumber,DOB;


	//Scanner input = new Scanner(System.in);
	

	public CreatingPasswordUsername(String UserName, String Password,String firstName,String lastName,String email,
			String address, String phoneNumber, String DOB){
		setPassword(Password);
		setUsername(UserName);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setDOB(DOB);
	}
	public boolean checkAccount() {
		boolean statement = false;
		
		while(statement != true) {
			if(checkPasswordName() == true && checkLength() == true && checkPassword() == true) {
				statement = true;
			}
			if(statement == false) {
				return false;
			}
		}
		
		return statement;
		
	}
	public void LengthPassword() {
		lengthPassword = password.length();
	}
	public boolean checkPassword() {
		char ch;
	    boolean capital = false;
	    boolean lowerCase = false;
	    boolean number = false;
	    for(int i=0;i < password.length();i++) {
	        ch = password.charAt(i);
	        if( Character.isDigit(ch)) {
	            number = true;
	        }
	        if (Character.isUpperCase(ch)) {
	            capital = true;
	        }
	        if (Character.isLowerCase(ch)) {
	            lowerCase = true;
	        }
	        if(number && capital && lowerCase) {
	            return true;
	        }
	    }
	    return false;
	}
	public boolean checkPasswordName() {
		boolean hasName = password.contains(username);
		String reverse = reverseName();
		boolean backWordName = password.contains(reverse);
		if(hasName == true || backWordName == true) {
			return false;
		}
		return true;
	}
	
	public String reverseName() {
		for(int i = username.length() - 1; i >= 0; i--) {
			backWordName += username.charAt(i);
		} 
		return backWordName;
	}
	
	public boolean checkLength() {
		LengthPassword();
		if(lengthPassword < 8) {
			return false;
		}
		return true;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getLengthPassword() {
		return lengthPassword;
	}
	public void setLengthPassword(int lengthPassword) {
		this.lengthPassword = lengthPassword;
	}

}

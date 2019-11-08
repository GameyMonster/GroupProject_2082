
import java.util.Scanner;

public class CreatingPasswordUsername {
	String password,username,backWordName = null;
	int lengthPassword;
	Scanner input = new Scanner(System.in);
	
	public void creatingUserName() {
		System.out.print("Create your user name:");
		username = input.nextLine();
	}
	public void creatingPassword() {
		System.out.print("Create your password:");
		password = input.nextLine();
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
			backWordName += password.charAt(i);
		} 
		System.out.println(backWordName);
		return backWordName;
	}
	
	public boolean checkLength() {
		LengthPassword();
		if(lengthPassword < 8) {
			return false;
		}
		return true;
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
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	
	public static void main(String args[]) {
		CreatingPasswordUsername prob = new CreatingPasswordUsername();
		boolean statement = false;
		prob.creatingUserName();
		prob.creatingPassword();
		while(statement != true) {
			if(prob.checkPasswordName() == true && prob.checkLength() == true && prob.checkPassword() == true) {
				statement = true;
			}
			if(statement == false) {
				System.out.println("Your password is invalid please make another password.");
				prob.creatingPassword();
			}
		}
		
	}

}

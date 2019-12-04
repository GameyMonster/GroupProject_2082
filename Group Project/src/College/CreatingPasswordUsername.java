package College;

import java.io.Serializable;
//import java.util.Scanner;

public class CreatingPasswordUsername implements Serializable {
	String password, username, backWordName = "";
	int lengthPassword;
	// Scanner input = new Scanner(System.in);

	public CreatingPasswordUsername(String UserName, String Password) {
		setPassword(Password);
		setUsername(UserName);
//		checkPassword();

	}

	public boolean checkAccount() {
		boolean statement = false;

		while (statement != true) {
			if (checkPasswordName() == true && checkLength() == true && checkPassword() == true) {
				statement = true;
			}
			if (statement == false) {
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
		for (int i = 0; i < password.length(); i++) {
			ch = password.charAt(i);
			if (Character.isDigit(ch)) {
				number = true;
			}
			if (Character.isUpperCase(ch)) {
				capital = true;
			}
			if (Character.isLowerCase(ch)) {
				lowerCase = true;
			}
			if (number && capital && lowerCase) {
				return true;
			}
		}
		return false;
	}

	public boolean checkPasswordName() {
		boolean hasName = password.contains(username);
		String reverse = reverseName();
		boolean backWordName = password.contains(reverse);
		if (hasName == true || backWordName == true) {
			return false;
		}
		return true;
	}

	public String reverseName() {
		for (int i = username.length() - 1; i >= 0; i--) {
			backWordName += username.charAt(i);
		}
		return backWordName;
	}

	public boolean checkLength() {
		LengthPassword();
		if (lengthPassword < 8) {
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

}

/****************************************************
 * 								Username: user1     *
 * To LogIn you should enter :                      *
 *								Password: emirko    *
 **************************************************** 								
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String checkUsername;
		String checkPass;
		
		Account account = new Account();
		
		System.out.println("Enter username: ");
		checkUsername = scanner.next();
		
		if (checkUsername.equals(account.getUsername())) {
			//System.out.println("Correct password. Welcome back..");
		}
		else {
			System.out.println("Entered username does not exist.");
			return;
		}
		
		System.out.println("Enter password: ");
		checkPass = scanner.next();
		
		if (checkPass.equals(account.getPassword())) {
			System.out.println("Correct password. Welcome back..");
		}
		else {
			System.out.println("Incorrect password!");
		}
	
	}

}

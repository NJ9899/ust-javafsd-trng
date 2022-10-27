import java.util.*;
//import question1.UserBO.*;

public class Main {
	

	public static void main(String args[]){
		UserBO b =new UserBO();
UserBO b1 =new UserBO();
		int id;
		String username,password;
		Scanner sc=new Scanner(System.in);
		
		String enc;
		
		
			System.out.println("Enter id: ");
			id=sc.nextInt();
			System.out.println("Enter username: ");
			username=sc.next();
			System.out.println("Enter password: ");
			password=sc.next();
			User obj1=new User(id,username,password);


	
		

			
			enc=b.encryptPassword(password);
		

		
			System.out.println("Id: "+obj1.getId());
			System.out.println("Username: "+obj1.getUsername());
			System.out.println("Password: "+obj1.getPassword());
			System.out.println("Decrypted password: "+enc);
			boolean value = b1.validate(username,password);
			if(value)
				System.out.println("Login successfull");
			else
				System.out.println("Invalid credentials");
		
		
	}
}
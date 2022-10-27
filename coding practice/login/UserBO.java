public class UserBO{
	User[] obj =new User[5];
	String encryptedPassword="", encryptedPass="";
	User[] getUsers(){
		obj[0]=new User(1,"Louis","rxfsuzA2345");
		obj[1]=new User(2,"Messie","hpphmf1");
		obj[2]=new User(3,"Steve","opefKt");
		obj[3]=new User(4,"Kallis","23456778");
		obj[4]=new User(5,"Wipro","A$%");
		return obj;
	}
	
	public String encryptPassword(String password){
		
		for(int i=0;i<password.length();i++){
			char ch=password.charAt(i);
			//System.out.println(encryptedPass);
			ch++;
			
			encryptedPass=encryptedPass+ch;
		}
		//System.out.println("In function: "+encryptedPassword);
		
		return encryptedPass;
	}

	boolean validate(String username,String password){
	int f=0;
	getUsers();
	String epass=encryptPassword(password);
	//System.out.println("Epass: "+epass);
		for(User i:obj){
			//System.out.println(i.username);
			if((i.getUsername().equals(username)) && (i.getPassword().equals(epass))){
				f=1;
				break;
			}
			else
				f=0;
		}
		if(f==1)
			return true;
		else
			return false;
	}
}
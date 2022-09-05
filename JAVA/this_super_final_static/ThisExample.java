package this_super_final_static;

public class ThisExample {

	public static void main(String args[]) {
		this_Test t = new this_Test(5,10);
		t.display();
	}


}



class this_Test{
	int val1;
	int val2;
	
	//Parameterized constructor
	this_Test(int val1,int val2){
		this.val1=val1+val2;
		this.val2=val2+val2;
	}
	
	void display() {
		System.out.println("Value val1= "+val1+" Value val2= "+val2);
	}
}


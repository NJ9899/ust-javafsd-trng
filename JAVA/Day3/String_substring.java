package day3;

public class String_substring {
	
	public static void main(String[] args) {
		
		String str1="program";
		
		//from 1st to the 7th character
		System.out.println(str1.substring(0,7));	//program
		
		//from 1st to the 5th character
		System.out.println(str1.substring(0,5));	//progr
		
		//from 4st to the 5th character
		System.out.println(str1.substring(3,5));	//gr
	}

}

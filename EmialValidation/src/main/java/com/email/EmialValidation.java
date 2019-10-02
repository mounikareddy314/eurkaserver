package com.email;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmialValidation {

	
	public static void main(String args[])
	{
		
		 String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		 
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher("mounikareddy314@gmail.com");
		 System.out.println(matcher.matches());
		 Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
		 String s = "+919513114360";
	        Matcher m = p.matcher(s); 
	        
	        if (m.matches()) {
	      	  System.out.println("Phone Number Valid");
	        }
	        else
	        {
	      	  System.out.println("Phone Number must be in the form XXX-XXXXXXX");
	        }
	        

	        
	}
}

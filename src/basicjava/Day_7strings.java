package basicjava;

public class Day_7strings {

	public static void main(String[] args) {
	String s1="welcome";
	String s2="home";
	//to find length
	System.out.println(s1.length());
	//concat()  ---to combine the two more strings
	String s3="mr";
	System.out.println(s1+s2);
	System.out.println(s1.concat(s2));
	System.out.println(s1.concat(s2).concat(s3));
	//trim() -- to remove the spaces on both sides
	String s4="       namasthe      ";
	System.out.println(s4.length());
	System.out.println(s4.trim().length());
//charAt() --to get specific character based on index
	System.out.println(s1.charAt(1));
	//contains() ---to check the string presence output is in boolean format
	System.out.println(s1.contains("wel"));
	System.out.println(s1.contains("Wel"));
	//equals() --to compare two string output is in boolean format
	String s5="Welcome";
	System.out.println(s1.equals(s5));
	//equalsIgnoreCase() -- to compare two strings and it is not case sensitive output is in boolean format
	System.out.println(s1.equalsIgnoreCase(s5));
	//replace() -- to replace characters or sequence of characters
	String s6=" you are beautiful just the way you are";
	System.out.println(s6.replace('u', 'v'));
	System.out.println(s6.replace("are", "supraja"));
	//split() -- it is used to split the string into two parts based on the delimeter(some special characters are 
	//  not allowed) delimeter means it can be anything , or : or variable anything.
	String s7="supraja-kiss-root";
	String s[]=s7.split("-");
	System.out.println(s[0]);
	System.out.println(s[1]);
	System.out.println(s[2]);
	//toUpperCase and toLowerCase change the strings to upper and lower
	System.out.println(s6.toUpperCase());
	System.out.println(s6.toLowerCase());
	//substring() ---to find the substring
	System.out.println(s1.substring(0,1));
	}

}

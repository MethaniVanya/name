
public class Pallindrome{
	 public static boolean pallindrome(String s)
	   {
	int i=0;
	int j= s.length()-1;
	while(i<j)
	{
	if (s.charAt(i) != s.charAt(j))
	             return false;
	{
	i++;
	j--;

	}
	   return true;
	}
	public static void main(String[] args){
	String s="DAD";
	  if(pallindrome(s))
	  System.out.println("the given string is a palindrome");
	   else
	  System.out.println("the given string is not a palindrome");
	}

	 }
	}



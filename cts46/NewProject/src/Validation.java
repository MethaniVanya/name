import java.util.Scanner;
class PAN
{
public static int testPan(String str)
{
if(str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
{
return 1;
}
else
{
return -1;
}
}

}
public class Validation {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter PAN Number");
String str=s.next();
int b=PAN.testPan(str);
if(b==1)
{
System.out.println("Pan Number is valid");
}
else
{
System.out.println("PAN Number is invalid");
}

}

}
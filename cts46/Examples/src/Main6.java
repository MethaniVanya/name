
import java.util.Scanner;

public class Main6 {

public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner s=new Scanner (System.in);
System.out.println("enter array 1 size");
int k1=s.nextInt();
System.out.println("enter array1 elements");
int l1[]=new int[10];
for(int i=0;i<k1;i++)
    {
    l1[i]=s.nextInt();
}
System.out.println("enter array 2 size");
int k2=s.nextInt();
System.out.println("enter array2 elements");
int l2[]=new int[10];
for(int j=0;j<k2;j++)
    {
    l2[j]=s.nextInt();
}


}

}


import java.util.Scanner;
import java.util.Arrays;
public class Large {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer value");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int n1=a[a.length-1]-a[0];
		int b=a.length;
		if(b==1)
		System.out.println("array elements are "+b);
		else
		System.out.println("difference is "+n1);
		}
	}

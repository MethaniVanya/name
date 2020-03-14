package examples;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Average {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of students");
int n=sc.nextInt();
TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
for(int i=0;i<n;i++)
{

int id=sc.nextInt();
int marks=sc.nextInt();
tm.put(id, marks);

}
System.out.println(tm);
System.out.println(tm.firstEntry());

}

}
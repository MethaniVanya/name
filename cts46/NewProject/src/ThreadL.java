interface Mathematics
{
public int add(int a,int b);
}
public class ThreadL{

public static void main(String[] args) {
// TODO Auto-generated method stub
Runnable r=()->{
for(int i=0;i<=10;i++)
System.out.println(i);
};
Thread t =new Thread(r);
  t.start();
  Mathematics run=(a,b)->a+b;
  System.out.println(run.add(10, 2));
  System.out.println(run.add(10, 20));
  System.out.println(run.add(10, 7));   


}
}
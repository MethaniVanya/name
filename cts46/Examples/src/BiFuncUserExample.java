import java.util.function.BiConsumer;

public class BiFuncUserExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bifunction<String,String,Student>bi=(htno,name)->new Student(htno,name);
Student s1=bi.apply("1001","vanya");
Student s1=bi.apply("1002","Ramya");
System.out.println(s2);

	}

}

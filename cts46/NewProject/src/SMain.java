import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class SMain {

	public static void main(String[] args) {
		ArrayList<Students>list=new ArrayList<Students>();
		Students s1=new Students("vanya",80);
		Students s2=new Students("navya",45);
		Students s3=new Students("kavya",85);
		Students s4=new Students("shiva",65);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("passed students are");
	    Predicate<Students>p=s->s.marks>=40;
	    Function<Students,String>f=stud->{
		int m=stud.marks;
		if(m>=80)
			return "Distinction";
		else if(m>=60 && m<=79)
			return "First Class";
		else if(m>=40 && m<=50)
			return "Second class";
		else
			return "Fail";
	};
	Consumer<Students>c=s->{
		
		System.out.print(s.name+"  ");
		System.out.println(f.apply(s));
	};
	for(Students s:list) {
		if(p.test(s))
		{
			c.accept(s);
		}
			
	}
}
}

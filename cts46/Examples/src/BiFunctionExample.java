import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BiFunction<Integer,Integer,Integer>add=(a,b)->(a+b);
      BiFunction<Integer,Integer,Integer>sub=(a,b)->(a-b);
      BiFunction<Integer,Integer,Integer>prod=(a,b)->(a*b);
      System.out.println("the sum"+add.apply(10, 20));
      System.out.println("the sub"+sub.apply(10, 4));
      System.out.println("the prod"+prod.apply(13,5));
	}

}

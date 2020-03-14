
public class UserMainCode2 {
	public static String findRoot(int a,int b,int c) {
		int d=(b*b)-(4*a*c);
		if(d>0)
			return"roots are real n unequal";
		else if(d==0)
		return "root real and equal";
	else return"roots are imaginary";
	}

}

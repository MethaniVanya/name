import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws SQLException{
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement =connection.createStatement();
		//String query="insert into loan_details values"+"('C0003','B00007',700000)"; 
		String query="update loan_details set loan_amount=2000 where branch_id='B00001' ";
		/*boolean flag=statement.execute(query);
		if(flag)
	System.out.println("Resultset returned.......");
		else*/
		int count=statement.executeUpdate(query);
		System.out.println(count+"Record(s) updated......"); 
	statement.close();
	connection.close();
	}
}

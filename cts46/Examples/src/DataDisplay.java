import java.sql.*;
public class DataDisplay {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement =connection.createStatement();
		String query="select * from loan_details";
		ResultSet rs=statement.executeQuery(query);
		while(rs.next())
			System.out.println(rs.getString(1)+" " +rs.getString(2)+" "+rs.getString(3)+" ");
		rs.close();
		statement.close();
		connection.close();

	}

}

import java.sql.*;
public class JdbcPrac {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String driverClassName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "Letmechange123!";
		String query = "insert into mydatabase(id,name_id) values (4,'Aryan')";
		
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		
		int count = st.executeUpdate(query);
		System.out.println("Number of rows affected : "+count);
		st.close();
		con.close();
		

	}

}

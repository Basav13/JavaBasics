import java.sql.*;

public class JdbcPrac {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String driverClassName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "Letmechange123!";
		String query = "insert into mydatabase(id,name_id) values (5,'Raju',5000)";
		
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		PreparedStatement pst = con.prepareStatement("update mydatabase set balance = ? where id = ?");
		CallableStatement cst = con.prepareCall("call func(?,?,?)");
		try
		{
			
			//int count = st.executeUpdate(query);
			//System.out.println("Number of rows affected : "+count);
//			pst.setString(1, "5000");
//			pst.setInt(2, 4);
//			int res = pst.executeUpdate();
//			System.out.println("Number of rows updated : "+res);
			cst.setInt(1, 1);
			cst.setInt(2, 2);
			cst.setInt(3, 500);
			int res2 = cst.executeUpdate();
			System.out.println("Number of rows affected : "+res2);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			st.close();
			pst.close();
			cst.close();
			con.close();
		}
	}

}

import java.sql.*;
class JDBCExample{
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/college",
				"root",
				"Sathwika@190814"
			);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");
			System.out.println("Student Data: ");
			while(rs.next()){
				System.out.println(
					rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("age")
				);
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
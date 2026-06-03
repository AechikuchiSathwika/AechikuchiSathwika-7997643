import java.sql.*;
class StudentDAO{
	Connection con;
	StudentDAO(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/college",
			"root",
			"Sathwika@190814"
			);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	void insertStudent(int id, String name, int age){
		try{
			String query = "INSERT INTO students VALUES (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			int rows = ps.executeUpdate();
			System.out.println(rows + " record inserted");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	void updateStudents(int id, int age){
		try{
			String query = "UPDATE students SET age=? WHERE id=?" ;
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,age);
			ps.setInt(2,id);
			int rows = ps.executeUpdate();
			System.out.println(rows + " record updated");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String args[]){
		StudentDAO s = new StudentDAO();
		s.insertStudent(6,"Aditya",29);
		s.updateStudents(6,28);
	}
}
import java.sql.*;
class Select_10_5 {
    public static void main(String a[]) throws Exception {
        Class.forName(``com.mysql.jdbc.Driver'');
	Connection con = DriverManager.getConnection
        (``jdbc:mysql://localhost/db_test'',``root'', ``root'');
	Statement stmt = con.createStatement();
	String query = ``SELECT * FROM Student'';
	ResultSet rs = stmt.executeQuery(query);
	while(rs.next()) {
	System.out.println(``current Row : '' +rs.getRow());
	System.out.println(``Id : '' +rs.getInt(``sid''));
	System.out.println(``Name : '' +rs.getString(``sname''));
	System.out.println(``Age : '' +rs.getInt(3));//retrieves third column values 
        }
    }
}

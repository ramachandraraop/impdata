import java.sql.*;
class PsInsert_10_4 {
    public static void main(String a[]) throws Exception {
        Class.forName(``com.mysql.jdbc.Driver'');
	Connection con = DriverManager.getConnection
        (``jdbc:mysql://localhost/db_test'', ``root'', ``root'');
	String query = ``INSERT into Student values (?, ?, ?, ?) '';
	PreparedStatement pstmt = con.prepareStatement(query);
	pstmt.setInt(1, 105);
	pstmt.setString(2, ``Prashanth'');
	pstmt.setInt(3, 24);
	pstmt.setString(4, ``Kerela'');
	pstmt.executeUpdate();
	pstmt.setInt(1, 106);
	pstmt.setString(2, ``Chandu'');
	pstmt.setInt(3, 21);
	pstmt.setString(4, ``Delhi'');
	pstmt.executeUpdate();
	System.out.println(``Rows Inserted Sucessfully'');
    }
}

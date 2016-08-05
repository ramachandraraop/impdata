import java.sql.*;
class PsInsertExample {
    public static void main(String a[]) {
        try {
            Class.forName(``com.mysql.jdbc.Driver'');
	    Connection con = DriverManager.getConnection(``jdbc:mysql: //localhost/db_test'', ``root'', ``root'');
	    String query = ``INSERT into Student VALUES (?, ?, ?, ?) '';
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
        catch (SQLException e) {
  	    System.out.println(``Exception'' +e.getMessage());
        }
        catch (Exception e) {
            System.out.println(``Exception'' +e.getMessage());
        }
        finally {
            if (con != null) { 
                System.out.println(``Closing connection'');
                con.close(); 
            } else { 
                System.out.println(``Connection Closed'');
           } 
       } 
    }
}

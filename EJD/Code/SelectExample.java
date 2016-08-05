import java.sql.*;
class SelectExample {
    public static void main(String a[]) {
        try {
            Class.forName(``com.mysql.jdbc.Driver'');
	    Connection con = DriverManager.getConnection(``jdbc:mysql: //localhost/db_test'', ``root'', ``root'');
	    Statement stmt = con.createStatement();
	    String query = ``SELECT * FROM Student'';
	    ResultSet rs = stmt.executeQuery(query);
	    while (rs.next()) {
	    System.out.println(``current Row : '' +rs.getRow());
	    System.out.println(``Id : '' +rs.getInt(``sid''));
	    System.out.println(``Name :''+rs.getString(``sname''));
	    System.out.println(``Age : '' +rs.getInt(3)); 
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

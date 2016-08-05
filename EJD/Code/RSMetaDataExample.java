import java.sql.*;
class RSMetaDataExample {
     public static void main(String a[]) {
        try {
            Class.forName(``com.mysql.jdbc.Driver'');
	    Connection con = DriverManager.getConnection(``jdbc:mysql: //localhost/db_test'', ``root'', ``root'');
	    Statement stmt = con.createStatement();
	    String query = ``SELECT * FROM Student '';
	    ResultSet rs = stmt.executeQuery(query);
	    ResultSetMetaData md = rs.getMetaData();
	    System.out.println(``Column count : '' +md.getColumnCount());
	    System.out.println(``second column Name : '' +md.getColumnName(2));
	    System.out.println(``Column Data Type : '' +md.getColumnTypeName(2));
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

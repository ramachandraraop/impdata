import java.sql.*;
class DBMetaDataExample {
    public static void main(String a[]) {
        try {
            Class.forName(``com.mysql.jdbc.Driver'');
	    Connection con = DriverManager.getConnection(``jdbc:mysql: //localhost/db_test'', ``root'', ``root'');
	    DatabaseMetaData md = con.getMetaData();
	    System.out.println(``Product Name : ''+md.getDatabaseProductName());
	    System.out.println(``Version : ''+md.getDatabaseProductVersion());
	    System.out.println(``Driver Name : ''+md.getDriverName());
	    System.out.println(``Major Version : ''+md.getDatabaseMajorVersion());
	    System.out.println(``Minor Version : ''+md.getDatabaseMinorVersion());
	    System.out.println(``Size:''+md.getMaxRowSize());
	    System.out.println(``URL : ''+md.getURL());
	    System.out.println(``User : ''+md.getUserName());
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

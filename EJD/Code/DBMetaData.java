import java.sql.*;
class DBMetaData {
    public static void main(String a[]) 
      throws Exception {
        Class.forName(``com.mysql.jdbc.Driver'');
	Connection con = 
        DriverManager.getConnection (``jdbc:mysql:
        //localhost/db_test'', ``root'', ``root'');
	DatabaseMetaData md = con.getMetaData();
	System.out.println(``Product Name : ''  
            + md.getDatabaseProductName());
	System.out.println(``Version : '' 
            + md.getDatabaseProductVersion());
	System.out.println(``Driver Name : ''
            + md.getDriverName());
	System.out.println(``Major Version : '' 
            + md.getDatabaseMajorVersion());
	System.out.println(``Minor Version : '' 
            + md.getDatabaseMinorVersion());
	System.out.println(``Row Size : '' 
            + md.getMaxRowSize());
	System.out.println(``URL : ''
            + md.getURL());
	System.out.println(``User : '' 
            + md.getUserName());
    }
}

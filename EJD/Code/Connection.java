import java.sql.*;
class ConnectionExample {
    public static void main(String a[]) {
        try {
            Class.forName(``com.mysql.jdbc.Driver'');
	    Connection con = DriverManager.getConnection(``jdbc:mysql: //localhost/db_test'', ``root'', ``root'');
            System.out.println(``Connected...'');
        } catch (SQLException e) {
              System.out.println(``SQLException'');
    }
}

import java.sql.*;
class Connection_10_1 {
    public static void main(String a[]) throws Exception {
        Class.forName(``com.mysql.jdbc.Driver'');
	Connection con = DriverManager.getConnection
        (``jdbc:mysql://localhost/db_test'', ``root'', ``root'');
	System.out.println(``Connected...'');
    }
}

import java.sql.*;
class CreateStatement {

    public static void main(String a[]) throws Exception {
        Class.forName(``com.mysql.jdbc.Driver'');
	Connection con = DriverManager.getConnection
	(``jdbc:mysql://localhost/db_test'', ``root'', ``root'');
	Statement stmt = con.createStatement();
	String query = ``CREATE TABLE Student(sid int(32), sname Varchar(35), age int(32), address Varchar(50))'';
	stmt.execute(query);
	System.out.println(``Table Created'');
}
}

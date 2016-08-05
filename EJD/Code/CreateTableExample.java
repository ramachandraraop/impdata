import java.sql.*;
class CreateTableExample {
     public static void main(String a[]) {
        try {
            Class.forName(``com.mysql.jdbc.Driver'');
	    Connection con = DriverManager.getConnection(``jdbc:mysql: //localhost/db_test'', ``root'', ``root'');
	    Statement stmt = con.createStatement();
	    String query = ``CREATE TABLE Student (sid int(32), sname Varchar(35), age int(32), address Varchar(50))'';
	    stmt.execute(query);
	    System.out.println(``Table Created'');
        } 
        catch (SQLException e) {
  	    System.out.println(``Exception'' +e.getMessage());
        }
        catch (Exception e) {
            System.out.println(``Exception'' +e.getMessage());
        }
    }
}

import java.sql.*;
class Insert {
    public static void main(String a[]) 
      throws Exception {
        Class.forName(``com.mysql.jdbc.Driver'');
	Class.forName(``com.mysql.jdbc.Driver'');
	Connection con = 
        DriverManager.getConnection (``jdbc:mysql:
        //localhost/db_test'', ``root'', ``root'');
	Statement stmt = con.createStatement();
	String query1 = ``INSERT INTO Student 
          VALUES (100, `Raj', 22, `Gachibowli')'';
	String query2 = ``INSERT INTO Student 
          VALUES (101, `Sagar', 26, `Dsnr')'';
	String query3 = ``INSERT INTO Student 
          VALUES (103, `Sruthi', 20, `Vizag')'';
	String query4 = ``INSERT INTO Student 
          VALUES (104, `Swathi', 28, `Mbnr')'';
	stmt.executeUpdate(query1);
	stmt.executeUpdate(query2);
	stmt.executeUpdate(query3);
	stmt.executeUpdate(query4);
	System.out.println(``Records 
                   Inserted Sucessfully'');
    }
}

import java.sql.*;
class Batch {
    public static void main(String a[]) 
      throws Exception {
        Class.forName(``com.mysql.jdbc.Driver'');
	Connection con = 
        DriverManager.getConnection (``jdbc:mysql:
        //localhost/db_test'', ``root'', ``root'');
        Statement stmt = con.createStatement();
	String query1 = ``INSERT INTO Student
          VALUES (109, `Pavan', 29, `Kakinada') '';
	String query2 = ``UPDATE Student SET 
          address = `USA'  WHERE sid = 101 '';
	String query3 = ``DELETE FROM Student 
          WHERE sid = 106'';
	stmt.addBatch(query1);
	stmt.addBatch(query2);
	stmt.addBatch(query3);
	stmt.executeBatch();
	System.out.println(``Batch Executed'');
    }
}

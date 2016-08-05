import java.sql.*;
class BatchExample {
    public static void main(String args[]) {
        Connection con = null;
        try {
            Class.forName(``com.mysql.jdbc.Driver'');
	    con = DriverManager.getConnection(``jdbc:mysql://localhost/db_test'', ``root'', ``root'');
            Statement stmt = con.createStatement();
	    String query1 = ``INSERT INTO EMP VALUES (109, 'albert', 9000)'';
            String query2 = ``INSERT INTO EMP VALUES (110, 'robert', 8000)'';
	    String query3 = ``UPDATE EMP SET sal = sal + 1000'';
	    String query4 = ``DELETE FROM EMP WHERE empno = 109'';
	    stmt.addBatch(query1);
	    stmt.addBatch(query2);
	    stmt.addBatch(query3);
	    stmt.addBatch(query4);
	    int a[] = stmt.executeBatch();
	    System.out.println(a[0] + `` row(s) inserted'');
	    System.out.println(a[1] + `` row(s) inserted'');
	    System.out.println(a[2] + `` row(s) updated'');
	    System.out.println(a[3] + `` row(s) deleted'');
	} catch(Exception e) {
            System.out.println(``Exception: '' + e.getMessage());
        }
        finally {
            try {
                con.close(); 
            } catch(Exception e){}
        }  
    }
}

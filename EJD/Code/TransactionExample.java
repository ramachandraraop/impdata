import java.sql.*;
class TransactionExample {
    public static void main(String a[]) {
        Connection con = null;
        try {
            Class.forName(``com.mysql.jdbc.Driver'');
            con = DriverManager.getConnection(``jdbc:mysql://localhost:3306/db_test'', ``root'', ``root'');
            Statement stmt = con.createStatement();
            con.setAutoCommit(false);
            stmt.addBatch(``update Bank set bal = bal - 1000 where accno = 7900'');
            stmt.addBatch(``update Bank set bal = bal + 1000 where accno = 000''); // fails updating record
            int a[] = stmt.executeBatch();
            for (int i = 0; i < 2; i++) {
                if (a[i] != 0) {	
                    System.out.println(``Transaction is success..'');
                    return;
                }
            }
            System.out.println(``Transaction is fail..'');
            con.rollback();
        } catch (Exception e) {
            System.out.println(``Exception'' + e.getMessage());
            System.out.println(``Transaction is failed..'');
            con.rollback();
        }
        finally {
            try {
                con.commit();          
                con.close(); 
            } catch(Exception e){}
        }

    }
}

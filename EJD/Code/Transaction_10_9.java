import java.sql.*;
class Transaction_10_9 {
    public static void main(String s[]) throws Exception {
        Class.forName(``com.mysql.jdbc.Driver'');
	Connection con = DriverManager.getConnection
        (``jdbc:mysql://localhost/db_test'',``root'', ``root'');
        con.setAutoCommit(false);
	String srcaccno = s[0];
	String destaccno = s[1];
	PreparedStatement pstmt = con.prepareStatement
        (``UPDATE Bank SET bal = bal+? WHERE accno = ?'');
        ps.setDouble(1,500);
	ps.setString(2,destaccno);
	int i = pstmt.executeUpdate();
	ps.setDouble(1,-500);
	ps.setString(2,srcaccno);
	int j = pstmt.executeUpdate();
	if (i == 1 && j == 1) {
	    con.commit();
	    System.out.println(``Amount transfered'');
	    con.close();
	    return;
	}
	    con.rollback();
	    System.out.println(``Cannot transfer the amount'');
	    con.close();
    }
}

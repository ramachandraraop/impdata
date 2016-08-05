import java.sql.*;
class RSMetaData_10_6 {
    public static void main(String a[]) throws Exception {
        Class.forName(``com.mysql.jdbc.Driver'');
	Connection con = DriverManager.getConnection
        (``jdbc:mysql://localhost/db_test'',``root'', ``root'');
	Statement stmt = con.createStatement();
	String query = ``SELECT * FROM Student '';
	ResultSet rs = stmt.executeQuery(query);
	ResultSetMetaData md = rs.getMetaData();
	System.out.println(``Column count : ''
                            +md.getColumnCount());
	System.out.println(``second column Name : ''
                            +md.getColumnName(2));
	System.out.println(``Column Data Type : ''
                            +md.getColumnTypeName(2));
    }
}

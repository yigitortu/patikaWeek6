import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        /*
        String sql = "SELECT * FROM student";
        String insertSQL = "INSERT INTO student (student_name, student_class) VALUES ('Ömer',3)";
        String prSQL = "INSERT INTO student (student_name, student_class) VALUES (?,?)";
        String stUpdateSQL = "UPDATE student SET student_name='Meriçhan' WHERE student_id=1";
        String prUpdateSQL = "UPDATE student SET student_name = ? WHERE student_id = ?";
        String stDeleteSQL = "DELETE FROM student WHERE student_id = 4";
        String prDeleteSQL = "DELETE FROM student WHERE student_id =?";
        */

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connect.setAutoCommit(false);
            Statement st = connect.createStatement();
            PreparedStatement pr = connect.prepareStatement("INSERT INTO student (student_name, student_class) VALUES (?,?)");

            pr.setString(1,"John");
            pr.setInt(2,1);
            pr.executeUpdate();

            if (true) {
                throw  new SQLException();
            }


            connect.commit();

                // Bilgileri sorgular...
       //     ResultSet data = st.executeQuery(sql);
       //     System.out.println(st.executeUpdate(insertSQL));
            // ADD SQL

            /*prSt.setString(1,"Emre");
            PreparedStatement prSt = connect.prepareStatement(prSQL);
            prSt.setInt(2,2);
            prSt.executeUpdate();
            prSt.close();*/

            // UPDATE SQL
           // PreparedStatement prSt = connect.prepareStatement(prUpdateSQL);
            // STATEMENT
          //  st.executeUpdate(stUpdateSQL);
            // PREPARE STATEMENT
           // prSt.setString(1,"Cem");
           // prSt.setInt(2,1);
           // prSt.executeUpdate();


            // DELETE SQL
            /*PreparedStatement prSt = connect.prepareStatement(prDeleteSQL);
            prSt.setInt(1,3);
            prSt.executeUpdate();*/







            /*while (data.next()){
                System.out.println("ID : " + data.getInt("student_id"));
                System.out.println("Ad : " + data.getString("student_name"));
                System.out.println("Sınıf : " + data.getInt("student_class"));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }*/

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}

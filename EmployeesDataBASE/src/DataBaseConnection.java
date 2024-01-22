import java.sql.*;

public class DataBaseConnection {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";




    public static void main(String[] args) {
        Connection connect = null;

        // SQL KOMUTLARI
        String sql = "SELECT * FROM employees";
        String insertSQL = "INSERT INTO employees (employees_name, employees_position) VALUES ('Ömer',3)";
        String prSQL = "INSERT INTO employees (employees_name, employees_position) VALUES (?,?)";
        String stUpdateSQL = "UPDATE employees SET employees_name='Meriçhan' WHERE employees_id=1";
        String prUpdateSQL = "UPDATE employees SET employees_name = ? WHERE employees_id = ?";
        String stDeleteSQL = "DELETE FROM employees WHERE employees_id = 4";
        String prDeleteSQL = "DELETE FROM employees WHERE employees_id =?";

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);

            while (data.next()) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("ID : " + data.getInt("employees_id"));
                System.out.println("Name : " + data.getString("employees_name"));
                System.out.println("Position : " + data.getString("employees_position"));
                System.out.println("Salary : " + data.getInt("employees_salary"));
            }






        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}

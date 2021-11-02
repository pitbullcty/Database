import java.sql.*;


public class Test {

    static String url = "jdbc:postgresql://127.0.0.1:5432/postgres";

    static String usr = "admin";

    static String psd = "";


    public static void main(String args[]) {

        Connection conn = null;

        try {

            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, usr, psd);

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM COURSE");

            while (rs.next()) {

                System.out.print(rs.getString(1));

                System.out.print("  ");

                System.out.println(rs.getString(2));

            }

            rs.close();

            st.close();

            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
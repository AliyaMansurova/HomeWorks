package Task1;

import java.security.PrivateKey;
import java.sql.*;

/**
 * Created by User on 28.02.2017.
 */
public class DbExample {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "masterkey");
            String sqlCreate = "Create table Comand (id serial,name character(80))";
            PreparedStatement psCreate = con.prepareStatement(sqlCreate);
            psCreate.executeUpdate();
            String sqlSelect = "SELECT* FROM Comand";
            PreparedStatement psSelect = con.prepareStatement(sqlSelect);
            ResultSet result2 = psSelect.executeQuery();
            System.out.println("Данные в базе");
            while (result2.next()) {
                System.out.println("\t Номер в базе #" + result2.getInt("id")
                        + "\t" + result2.getString("name"));
            }
            String sqlInsert = "INSERT INTO Comand(name,id) VALUES(?,?)";
            PreparedStatement psInsert = con.prepareStatement(sqlInsert);
            psInsert.setString(1, "Кукушнин");
            psInsert.setInt(2, 851001);
            String sqlInsert2 = "INSERT INTO Comand(name,id) VALUES(?,?)";
            PreparedStatement psInsert2 = con.prepareStatement(sqlInsert2);
            psInsert2.setString(1, "Иванов");
            psInsert2.setInt(2,105);
            psInsert2.executeUpdate();
            String sqlUpdate = "UPDATE Comand SET name = ? where id = 851001";
            PreparedStatement psUpdate = con.prepareStatement(sqlUpdate);
            psInsert.setString(1, "Иванов");
            psInsert.executeUpdate();
            String sqlSelect2 = "SELECT* FROM Comand";
            PreparedStatement psSelect2 = con.prepareStatement(sqlSelect2);
            ResultSet result3 = psSelect2.executeQuery();
            System.out.println("Данные в базе");
            while (result3.next()) {
                System.out.println("\t Номер в базе #" + result3.getInt("id")
                        + "\t" + result3.getString("name"));
            }
            String sqlDelete = "Delete from Comand";
            PreparedStatement psDelete = con.prepareStatement(sqlDelete);
            psDelete.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



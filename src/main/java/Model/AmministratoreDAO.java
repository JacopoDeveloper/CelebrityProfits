package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AmministratoreDAO {
    public static Amministratore doRetrieveByUserPassword(String user, String password){
        try(Connection con = ConPool.getConnection()){
            PreparedStatement ps = con.prepareStatement("SELECT * FROM " +
                    "amministratore WHERE username=? AND password=?");
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Amministratore a = new Amministratore();
                a.setId(rs.getInt(1));
                a.setUsername(rs.getString(2));
                a.setPassword(rs.getString(3));
                return a;
            }
            return null;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}

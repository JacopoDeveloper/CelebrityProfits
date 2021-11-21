package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatrimonioDAO {

    public static Patrimonio doRetrieveById(int id){
        try(Connection con = ConPool.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM  patrimonio WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Patrimonio p = new Patrimonio();
                p.setId(rs.getInt(1));
                p.setAmount(rs.getString(2));
                p.setDefault_currency(rs.getString(3));
                p.setIdCelebrita(rs.getInt(4));
                return p;
            }
            return null;
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    public static List<Patrimonio> doRetrieveAll(){
        try(Connection con = ConPool.getConnection()){
            PreparedStatement ps = con.prepareStatement("SELECT * FROM patrimonio");
            ResultSet rs = ps.executeQuery();
            List<Patrimonio> lista = new ArrayList<>();
            while(rs.next()){
                Patrimonio p = new Patrimonio();
                p.setId(rs.getInt(1));
                p.setAmount(rs.getString(2));
                p.setDefault_currency(rs.getString(3));
                p.setIdCelebrita(rs.getInt(4));
                lista.add(p);
            }
            if(lista.size() > 0)
                return lista;
            else
                return null;
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    public static List<Patrimonio> doRetrieveAllByIdCelebrita(int id) {
        try(Connection con = ConPool.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM  patrimonio WHERE idCelebrita=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            List<Patrimonio> lista = new ArrayList<>();
            while(rs.next()){
                Patrimonio p = new Patrimonio();
                p.setId(rs.getInt(1));
                p.setAmount(rs.getString(2));
                p.setDefault_currency(rs.getString(3));
                p.setIdCelebrita(rs.getInt(4));
                lista.add(p);
            }
            if(lista.size() > 0)
                return lista;
            else
                return null;
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}

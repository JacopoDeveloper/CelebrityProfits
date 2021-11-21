package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CelebritaDAO {
    public static Celebrita doRetrieveById(int id){
        try(Connection con = ConPool.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM  celebrita WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Celebrita c = new Celebrita();
                c.setId(rs.getInt(1));
                c.setNome(rs.getString(2));
                c.setDescrizione(rs.getString(3));
                c.setImmagine(rs.getString(4));
                c.setPosizione(rs.getInt(5));
                c.setSesso(rs.getString(6));
                c.setPatrimonio(rs.getString(7));
                return c;
            }
            return null;
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    public static List<Celebrita> doRetrieveAll(){
        try(Connection con = ConPool.getConnection()){
            PreparedStatement ps = con.prepareStatement("SELECT * FROM celebrita");
            ResultSet rs = ps.executeQuery();
            List<Celebrita> lista = new ArrayList<>();
            while(rs.next()){
                Celebrita c = new Celebrita();
                c.setId(rs.getInt(1));
                c.setNome(rs.getString(2));
                c.setDescrizione(rs.getString(3));
                c.setImmagine(rs.getString(4));
                c.setPosizione(rs.getInt(5));
                c.setSesso(rs.getString(6));
                c.setPatrimonio(rs.getString(7));
                lista.add(c);
            }
            if(lista.size() > 0)
                return lista;
            else
                return null;
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }



    public static void doSave(Celebrita celebrita){
        try (Connection con = ConPool.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO utente (nome, descrizione, immagine) VALUES(?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, celebrita.getNome());
            ps.setString(2, celebrita.getDescrizione());
            ps.setString(3, celebrita.getImmagine());
            if (ps.executeUpdate() != 1) {
                throw new RuntimeException("INSERT error.");
            }

            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            celebrita.setId(id);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Celebrita> doRetrieveBySesso(String sesso) {
        try(Connection con = ConPool.getConnection()){
            PreparedStatement ps = con.prepareStatement("SELECT * FROM celebrita WHERE sesso=?");
            ps.setString(1, sesso);
            ResultSet rs = ps.executeQuery();
            List<Celebrita> lista = new ArrayList<>();
            while(rs.next()){
                Celebrita c = new Celebrita();
                c.setId(rs.getInt(1));
                c.setNome(rs.getString(2));
                c.setDescrizione(rs.getString(3));
                c.setImmagine(rs.getString(4));
                c.setPosizione(rs.getInt(5));
                c.setSesso(rs.getString(6));
                c.setPatrimonio(rs.getString(7));
                lista.add(c);
            }
            if(lista.size() > 0)
                return lista;
            else
                return null;
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }


    /*public static void doUpdate(Utente utente, int id){
        try (Connection con = ConPool.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE utente SET nome = ?, cognome = ?, via = ?, cap = ?, paese = ?, numero = ? WHERE id=?",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, utente.getNome());
            ps.setString(2, utente.getCognome());
            ps.setString(3, utente.getVia());
            ps.setString(4, utente.getCap());
            ps.setString(5, utente.getPaese());
            ps.setString(6, utente.getNumero());
            ps.setInt(7, id);
            if (ps.executeUpdate() != 1) {
                throw new RuntimeException("UPDATE error.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }*/


}

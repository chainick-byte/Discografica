/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import utiles.Conexion;

/**
 *
 * @author igorr no implmento interfaz aqui por que solo va a implemenar un
 * metodo!!!
 */
public class PrepareTransaccionDAO {

    Connection con;
    PreparedStatement ps;

    public void reiniciarBBDD(List<String> miLista) {
        Statement sta;
        String sql = "?";
        try {
            con = new Conexion().getConexion();
            con.setAutoCommit(false);
            ps = con.prepareStatement(sql);
            for (int i = 1; i < miLista.size(); i++) {
                if (miLista.get(i) != null) {
                    ps.setString(1, miLista.get(i));
                    System.out.println(i);
                    System.out.println(miLista.get(i));
                    ps.addBatch(miLista.get(i));
                }
                
            }
            ps.executeBatch();
            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public int rellenarAlbum(List<String> miLista) {
        Statement sta;
        try {
            con = new Conexion().getConexion();
            sta = con.createStatement();
            for (int i = 1; i < miLista.size(); i++) {
                if (miLista.get(i) != null) {
                    
                   sta.executeUpdate(miLista.get(i));
                }
                System.out.println("hago vueltas numero: " + i);
            }
            sta.executeBatch();
            sta.close();
            con.close();
            System.out.println("no peto");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosDAO;

import utiles.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorr
 */
public class CancionDAO implements CRUD {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List dameTodoPorId(int variable) {
        List<AlbumCancion> miListaCancion = new ArrayList<>();
        String sql = "Select c.cancion_id, c.nombre_cancion,c.descripcion,a.grupo_musical,a.nombre,a.anno from album as a,cancion as c"
                + " where a.album_id=c.album_num and a.album_id=?";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, variable);
            rs = ps.executeQuery();
            while (rs.next()) {
                AlbumCancion ac = new AlbumCancion();
                ac.setCancion_id(rs.getInt(1));
                ac.setNombre_cancion(rs.getString(2));
                ac.setDescripcion(rs.getString(3));
                ac.setGrupo_musical(rs.getString(4));
                ac.setNombre(rs.getString(5));
                ac.setAnno(rs.getInt(6));
                miListaCancion.add(ac);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return miListaCancion;
    }

    @Override
    public int guardar(Object[] o) {
        int respuesta = 0;
        String sql = "insert into cancion values(null, ?,?,?)";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            for (int i = 0; i < o.length; i++) {
            }
            respuesta = ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    @Override
    public int actuaizar(Object[] o) {
        int respuesta = 0;
        String sql = "update cancion set nombre_cancion=?,descripcion=? where cancion_id=?";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            respuesta = ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from cancion where cancion_id=?";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
        }
    }

    @Override
    public List dameTodo() {
        List<Cancion> miListaCancion = new ArrayList<>();
        String sql = "Select * from cancion order by cancion_id asc";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cancion c = new Cancion();
                c.setCancion_id(rs.getInt(1));
                c.setNombre_cancion(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setAlbum_num(rs.getInt(4));
                miListaCancion.add(c);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return miListaCancion;

    }

}

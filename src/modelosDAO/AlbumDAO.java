/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosDAO;

import utiles.Conexion;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author igorr
 */
public class AlbumDAO implements CRUD {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
//aqui igual seria lo suyo pasar id de la tupla
    public List buscarAlbumPorNombre_Album(String nombre) {
       List<Album> misAlbumes = new ArrayList<>();
        String sql = "select *from album where nombre=?";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                Album al = new Album();
                al.setId(rs.getInt(1));
                al.setNombre(rs.getString(2));
                al.setAnno(rs.getInt(3));
                al.setImagen(rs.getString(4));
                al.setGrupo_musical(rs.getString(5));
                misAlbumes.add(al);
                
            }
            con.close();
        } catch (Exception e) {
         }
        return misAlbumes;

    }
    public List buscarAlbumPorAnno(int anno) {
       List<Album> misAlbumes = new ArrayList<>();
        String sql = "select *from album where anno=?";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,anno);
            rs = ps.executeQuery();
            while (rs.next()) {
                Album al = new Album();
                al.setId(rs.getInt(1));
                al.setNombre(rs.getString(2));
                al.setAnno(rs.getInt(3));
                al.setImagen(rs.getString(4));
                al.setGrupo_musical(rs.getString(5));
                misAlbumes.add(al);
                
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
         }
        return misAlbumes;

    }

    @Override
    public List dameTodo() {
        List<Album> misAlbumes = new ArrayList<>();
        String sql = "select *from album order by album_id desc";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Album al = new Album();
                al.setId(rs.getInt(1));
                al.setNombre(rs.getString(2));
                al.setAnno(rs.getInt(3));
                al.setImagen(rs.getString(4));
                al.setGrupo_musical(rs.getString(5));
                misAlbumes.add(al);
            }
            con.close();
        } catch (Exception e) {
         }
        return misAlbumes;
    }

    @Override
    public int guardar(Object[] o) {
        int respuesta = 0;
        String sql = "insert into album(album_id,nombre,anno,imagen, grupo_musical) values(null,?,?,?,?)";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            respuesta = ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    @Override
    //se utiliza para mostrar en los forms los datos seleccionados
    public int actuaizar(Object[] o) {
        int respuesta = 0;
        String sql = "update album set nombre=?, anno=?,imagen=?, grupo_musical=? where id_album=?;";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            respuesta = ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    @Override
    public void eliminar(int id) {

        String sql = " delete from album where album_id=?;";
        try {
            con = new Conexion().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}

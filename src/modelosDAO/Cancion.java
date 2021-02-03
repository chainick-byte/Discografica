/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosDAO;

/**
 *
 * @author igorr
 */
public class Cancion {
    
    int cancion_id;
    String nombre_cancion;
    String descripcion;
    int album_num;

    public Cancion() {
    }

    public Cancion(int cancion_id, String nombre_cancion, String descripcion, int album_num) {
        this.cancion_id = cancion_id;
        this.nombre_cancion = nombre_cancion;
        this.descripcion = descripcion;
        this.album_num = album_num;
    }

    public int getCancion_id() {
        return cancion_id;
    }

    public void setCancion_id(int cancion_id) {
        this.cancion_id = cancion_id;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAlbum_num() {
        return album_num;
    }

    public void setAlbum_num(int album_num) {
        this.album_num = album_num;
    }
    
}

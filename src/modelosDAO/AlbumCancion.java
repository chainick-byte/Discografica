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
public class AlbumCancion {
    int cancion_id;
    String nombre_cancion;
    String descripcion;
    String grupo_musical;
    String nombre;
    int anno;

    public AlbumCancion() {
    }

    public AlbumCancion(int cancion_id, String nombre_cancion, String descripcion, String grupo_musical, String nombre, int anno) {
        this.cancion_id = cancion_id;
        this.nombre_cancion = nombre_cancion;
        this.descripcion = descripcion;
        this.grupo_musical = grupo_musical;
        this.nombre = nombre;
        this.anno = anno;
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

    public String getGrupo_musical() {
        return grupo_musical;
    }

    public void setGrupo_musical(String grupo_musical) {
        this.grupo_musical = grupo_musical;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    
}

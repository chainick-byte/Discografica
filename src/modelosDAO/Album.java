package modelosDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igorr
 */
public class Album {
    
    int id;
    String nombre;
    int anno;
    String imagen="logoUFV.png";
    String grupo_musical;

    public Album() {
    }

    public Album(int id, String nombre, int anno, String grupo_musical) {
        this.id = id;
        this.nombre = nombre;
        this.anno = anno;
        this.grupo_musical = grupo_musical;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", nombre=" + nombre + ", anno=" + anno + ", imagen=" + imagen + ", grupo_musical=" + grupo_musical + '}';
    }
    
    

    

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGrupo_musical() {
        return grupo_musical;
    }

    public void setGrupo_musical(String grupo_musical) {
        this.grupo_musical = grupo_musical;
    }
    
    
    
    
    
}

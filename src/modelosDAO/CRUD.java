/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosDAO;

import java.util.List;

/**
 *
 * @author igorr
 */
public interface CRUD {
    
    public List dameTodo();
    public int guardar(Object[] o);
    public int actuaizar(Object[] o);
    public void eliminar(int id);
    
}

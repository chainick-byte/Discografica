/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author igorr
 */
public class ManejadorImagenes {

    JFileChooser miFileChooser = new JFileChooser();
    ;
    

    public ManejadorImagenes() {

    }

    public ManejadorImagenes(JFileChooser miFileChooser, String origen) {
        this.miFileChooser = miFileChooser;
    }

    public File dameFile() {
        File fichero = new File("src/img/logoUfv.png");
        int seleccion=miFileChooser.showOpenDialog(miFileChooser);
        if(seleccion==JFileChooser.APPROVE_OPTION){
            fichero=miFileChooser.getSelectedFile();
            if(fichero.canRead()){
                if(fichero.getName().endsWith("png")||fichero.getName().endsWith("jpg")||
                        fichero.getName().endsWith("gif")){
                    return fichero;
                }else{
                   JOptionPane.showMessageDialog(miFileChooser, "archivo no compatible");
                   miFileChooser.cancelSelection();
                   return new File("src/img/logoUfv.png");
                }
            }else if(seleccion==JFileChooser.CANCEL_OPTION){
                System.out.println("Has cerrado buscador de archivos!");
            }
        }else{
            
        }

        return fichero;

    }
    public String copiaFile(File file) throws IOException{
        Path origen=Paths.get(file.getAbsolutePath());
        Path destino=Paths.get("src/img/"+file.getName());
        Files.copy(origen, destino,REPLACE_EXISTING);
        System.out.println(origen.toString());
        System.out.println(destino.toString());
        return file.getName();
    }
}

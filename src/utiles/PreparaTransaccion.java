/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author igorr
 */
public class PreparaTransaccion {

    List<String> miLista = new ArrayList<>();
    String linea;

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public PreparaTransaccion(String url) {
        String auxiliar;
        try {
            BufferedReader miLector = new BufferedReader(new FileReader(url));
            while ((auxiliar = miLector.readLine()) != null) {
                linea = linea + auxiliar.trim();
            }
            getMiLista();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<String> getMiLista() {
        miLista = Arrays.asList(linea.split(";"));
        List<String> auxiliar = new ArrayList<>();
        for (int i = 1; i < miLista.size(); i++) {
            if(miLista.get(i)!=null){
                auxiliar.add(miLista.get(i)+";");
            }

        }
        return auxiliar;
    }

    public void setMiLista(List<String> miLista) {
        this.miLista = miLista;
    }

}

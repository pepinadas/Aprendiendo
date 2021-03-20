/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author Personal
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho = new Automovil();
        //miBocho.marca="volkswagen";
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1870);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        //Tarea.- Programar los objetos miAcura y miMustang
        Automovil miAcura = new Automovil();
        
        miAcura.setMarca("Acura");
        miAcura.setSubMarca("NSX");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.black);
        System.out.println(miAcura);
        
        Automovil miMustang = new Automovil();
        
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Mustang");
        miMustang.setModelo(2015);
        miMustang.setColor(Color.yellow);
        System.out.println(miMustang);
        
    }
    
}

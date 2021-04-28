/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.unidad.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Irvin
 */
public class Grafica {
    private String TipoGraf;
    private int Vram;
   String marca;
    public Grafica(String TipoGraf, int Vram){
        this.TipoGraf=TipoGraf;
        this.Vram=Vram;
        JOptionPane.showMessageDialog(null, "La tarjeta grafica del PC es una " +TipoGraf +"\n"
        + "Esta tiene " + Vram +"GB de Vram");
    }public String getmarca(){
        return marca;
    }
    
    
    
    
}

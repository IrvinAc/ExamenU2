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
public class PC {
    public String ProcMarc, disk ;
    public int ram ;
    public PC(String ProcMarc, String disk, int ram) {
        this.ProcMarc=ProcMarc;
        this.ram=ram;
        this.disk=disk;
        JOptionPane.showMessageDialog(null, "La  pc tiene un procesador " + ProcMarc + "\n"
                + "Tiene " + ram + "Gb de ram \n"
                        + "Tiene un Disco " + disk );
}
    public PC (String ProcMarc){
        JOptionPane.showMessageDialog(null, "Esta PC solo cuanta con un Procesador " +ProcMarc + "\n"
                + "Le faltan los demas componentes" );
    }
    public void encender (){
        JOptionPane.showMessageDialog(null, "Enciende la PC");
    }
    public void encender (int ent){
        JOptionPane.showMessageDialog(null , "la PC tarda en encender " + ent + "min." );
    }
    public void encender (int ent, String disk){
        JOptionPane.showMessageDialog(null, "La PC enciende en " + ent + "min, por el disco ya que este es un " + disk );
    }
    public void espacio (double espacio){
        if (espacio>=1000){
            double TB=espacio/1000;
            JOptionPane.showMessageDialog(null,"La PC tiene " + TB + "TB de espacio");
        }else
            JOptionPane.showMessageDialog(null, "La PC tiene " + espacio + "GB de espacio ");
    }
    public void espacio (int espacio, int part ){
        JOptionPane.showMessageDialog(null, "El disco tiene una particion de " + part + "GB");
        double espct=espacio-part;
        if (espct>=1000){
        double l=espct/1000;    
        JOptionPane.showMessageDialog(null, "El espacio libre sin tomar la particion es de " +l +"TB");
        }else{
            JOptionPane.showMessageDialog(null, "El espacio libre sin tomar la particion es de " +espct +"GB");                    
        }
            
    }
    
   
    
}

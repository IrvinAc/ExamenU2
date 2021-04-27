/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.unidad.pkg2;

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
        System.out.println("La pc tiene un procesador " + ProcMarc);
        System.out.println("Tiene " + ram + "gb de ram");
        System.out.println("Tiene un disco " + disk );
}
    public void encender (){
        System.out.println("Enciendes la pc");
    }
    public void encender (int ent){
        System.out.println("La pc tarda en encender " + ent + "min.");
    }
    public void encender (int ent, String disk){
        System.out.println("La pc enciende en " + ent + "min, por el disco " + disk + " que tiene");
    }
    public void espacio (double espacio){
        if (espacio>=1000){
            double TB=espacio/1000;
            System.out.println("La pc tiene " + TB + "Tb de espacio ");
        }else
        System.out.println("la pc tiene " + espacio + "GB de espacio");
    }
    public void espacio (int espacio, int part ){
        System.out.println("El disco tiene una particion de " + part+ "GB ");
        double espct=espacio-part;
        if (espct>=1000){
            
        double l=espct/1000;    
        System.out.println("El espacio libre sin tomar la particion es de " +l+ "TB");
        }else{
            System.out.println("El espacio libre sin tomar la particion es de " +espct+ "GB");
                    
        }
            
    }
    
   
    
}

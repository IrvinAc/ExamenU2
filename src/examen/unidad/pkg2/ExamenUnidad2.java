/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.unidad.pkg2;
//Irvin Isaac Acosta Romo 

import javax.swing.JOptionPane;

/**
 * *
 * @author Irvin
 */
public class ExamenUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hay 4 computadoras");
        JOptionPane.showMessageDialog(null, "La primera PC");
        PC Primera = new PC("I7 6670", "SSD", 16);
        Primera.encender();
        Primera.espacio(500);
        Grafica primgraf = new Grafica("Rtx 2060", 6);
        primgraf.marca = "MSI";
        JOptionPane.showMessageDialog(null, "La grafica es de la marca " + primgraf.marca);
        
        JOptionPane.showMessageDialog(null, "La segunda PC");
        PC segunda = new PC("Ryzen 3 3200g", "HDD", 8);
        segunda.encender();
        segunda.encender(4);
        segunda.encender(4, "HDD");
        segunda.espacio(1000);
        Grafica Graf2 = new Grafica("Gtx 1660", 6);
        Graf2.marca = "Asus";
        Graf2.getmarca();
        JOptionPane.showMessageDialog(null, "La grafica es de la marca " + Graf2.marca);
        
        JOptionPane.showMessageDialog(null, "La tercera PC");
        PC tercera = new PC("I5 4590", "HDD", 12);
        tercera.encender();
        tercera.encender(4);
        tercera.encender(4, "HDD");
        tercera.espacio(1500);
        tercera.espacio(1500, 500);
        Grafica Graf3 = new Grafica("Gtx 1050", 2);
        Graf3.marca = "Gigabyte";
        Graf3.getmarca();
        JOptionPane.showMessageDialog(null, "La grafica es de la marca " + Graf3.marca);
        
        JOptionPane.showMessageDialog(null, "La cuarta PC");
        PC NoFun = new PC("AMD Ryzen 5 3600X");

    }

    // TODO code application logic here
}

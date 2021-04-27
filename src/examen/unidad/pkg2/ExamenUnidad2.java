/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.unidad.pkg2;
//Irvin Isaac Acosta Romo 
/**
 *
 * @author Irvin
 */
public class ExamenUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PC Primera =new PC("I7 6670","SSD", 16);
        Primera.getencender();
        Primera.getespacio(500);
        Grafica primgraf = new Grafica("Rtx 2060", 6);
        primgraf.marca="MSI";
        System.out.println("La grafica es de la marca " + primgraf.getmarca());
        System.out.println("");
        
        PC segunda =new PC("Ryzen 3 3200g", "HDD", 8);
        segunda.getencender();
        segunda.getencender(4);
        segunda.getencender(4, "HDD");
        segunda.getespacio(1000);
        Grafica Graf2=new Grafica ("Gtx 1660", 6);
        Graf2.marca="Asus";
        Graf2.getmarca();
        System.out.println("La grafica es de la marca " + Graf2.getmarca());
        System.out.println("");
        
        PC tercera=new PC("I5 4590","HDD", 12);
       tercera.getencender();
       tercera.getencender(4);
       tercera.getencender(4, "HDD");
       tercera.getespacio(1500);
       tercera.getespacio(1500, 500);
       Grafica Graf3=new Grafica ("Gtx 1050", 2);
       Graf3.marca="Gigabyte";
       Graf3.getmarca();
       System.out.println("La grafica es de la marca " + Graf3.getmarca());
       System.out.println("");
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp1.ldeleijap.a012p1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Benito Mv
 */
public class SPP1LDeleijaPA012P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double estatura;
     double peso;
     double imc;
     estatura= solicitar("Introduce tu estatura en metros");
     peso= solicitar("Introduce tu peso en kg");
     
     imc= peso/Math.pow(estatura,2);
     JOptionPane.showMessageDialog(null, "El IMC ES DE: "+imc);
    }
    public static double solicitar(String mensaje){
        Scanner kb = new Scanner (System.in);
        String dato;
        double num = 0;
        boolean flag;
        do{
            try{
            dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
}
    
   

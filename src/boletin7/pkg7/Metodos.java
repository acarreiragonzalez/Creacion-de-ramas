
package boletin7.pkg7;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Metodos {
    
    Double base, altura, radio, Pi;
   
    
    public Metodos(){}
    public Metodos(double b, double a, double r, double p){
    base=b;
    altura=a;
    radio=r;
    Pi=p;}
    
    
    public void menu(){
    
    
        
         
        String resposta =JOptionPane.showInputDialog("Selecciona figura:\n Cuadrado\n Triángulo\n Círculo");
        
   
     switch (resposta){
    
        case "Cuadrado": 
      String dato=  JOptionPane.showInputDialog("dame o lado");
        double lado=Double.parseDouble(dato);
        JOptionPane.showMessageDialog(null, " A área do cuadrado é " + (lado* lado));
        case "Triángulo" :
           String dato2= JOptionPane.showInputDialog("Dame a base");
           
           double b=Double.parseDouble(dato2);
              String dato3=      JOptionPane.showInputDialog("Dame a altura");
            double a=Double.parseDouble(dato3);
            
            JOptionPane.showMessageDialog(null, "A área do triángulo" + (b*a/2));
        case "Círculo":
            String dato4= JOptionPane.showInputDialog("Dame o radio do circulo");
                    double r= Double.parseDouble(dato4);
        
            double p= 3.14;
            JOptionPane.showMessageDialog(null, "A área do círculo é" +((r*r)*p));
        
   }
    }
    //commit1
}
              
                
                
        

        



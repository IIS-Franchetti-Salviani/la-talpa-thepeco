/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gioco.schiacciabuldog;

/**
 *
 * @author pecorelli.davide
 */
public class GiocoSchiacciaBuldog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       javax.swing.JFrame finestra = new javax.swing.JFrame("Schiaccia il Bulldog");

       Interfaccia i = new Interfaccia();

       finestra.add(i);
       

       finestra.setSize(800, 600);


       finestra.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);


       finestra.setLocationRelativeTo(null);


       finestra.setVisible(true);
        
    }
    
}

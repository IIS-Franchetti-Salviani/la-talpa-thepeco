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
        
      Interfaccia i = new Interfaccia();
    
    // 2. NON usare finestra.add(i). Usa i metodi direttamente su 'i'
    i.setTitle("Schiaccia la Talpa");
    i.setSize(800, 600);
    i.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    i.setLocationRelativeTo(null); // Centra la finestra
    
    // 3. Rendi visibile la finestra
    i.setVisible(true);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gioco.schiacciabuldog;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
/**
 *
 * @author Davide
 */
public class Interfaccia extends javax.swing.JPanel {

    
    Timer timerGioco;
    javax.swing.JButton[] bottoni; 
    Random rand = new Random();
    
    public Interfaccia() {
        initComponents();
      
        TALPA.setText("TALPA");
        TALPA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TALPA.setOpaque(true); 
        TALPA.setBackground(java.awt.Color.RED); 
        TALPA.setForeground(java.awt.Color.WHITE);
        TALPA.setSize(80, 30); 

        
        bottoni = new javax.swing.JButton[]{Buca4, Buca1, Buca2, Buca3};

        
        timerGioco = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int indiceCasuale = rand.nextInt(bottoni.length);
                javax.swing.JButton btnScelto = bottoni[indiceCasuale];

                
                int x = btnScelto.getX() + (btnScelto.getWidth() / 2) - (TALPA.getWidth() / 2);
                int y = btnScelto.getY() + (btnScelto.getHeight() / 2) - (TALPA.getHeight() / 2);

                
                TALPA.setLocation(x, y);
                
                
                TALPA.getParent().setComponentZOrder(TALPA, 0);
                TALPA.getParent().repaint();
            }
        });

        timerGioco.start(); 
    }
    
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Buca4 = new javax.swing.JButton();
        Buca3 = new javax.swing.JButton();
        Buca1 = new javax.swing.JButton();
        Buca2 = new javax.swing.JButton();
        TALPA = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setLayout(null);

        Buca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buca4ActionPerformed(evt);
            }
        });
        add(Buca4);
        Buca4.setBounds(420, 310, 160, 110);

        Buca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buca3ActionPerformed(evt);
            }
        });
        add(Buca3);
        Buca3.setBounds(120, 310, 160, 110);

        Buca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buca1ActionPerformed(evt);
            }
        });
        add(Buca1);
        Buca1.setBounds(120, 130, 160, 110);

        Buca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buca2ActionPerformed(evt);
            }
        });
        add(Buca2);
        Buca2.setBounds(420, 130, 160, 110);

        TALPA.setText("TALPA");
        add(TALPA);
        TALPA.setBounds(320, 240, 36, 40);
    }// </editor-fold>//GEN-END:initComponents

    
    int punti = 0;
    
    private void Buca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buca2ActionPerformed
        controllaColpo(Buca2);
    }//GEN-LAST:event_Buca2ActionPerformed

    private void Buca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buca1ActionPerformed
        controllaColpo(Buca1);
    }//GEN-LAST:event_Buca1ActionPerformed

    private void Buca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buca3ActionPerformed
       controllaColpo(Buca3);
    }//GEN-LAST:event_Buca3ActionPerformed

    private void Buca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buca4ActionPerformed
        controllaColpo(Buca4);
    }//GEN-LAST:event_Buca4ActionPerformed

    private void controllaColpo(javax.swing.JButton bottoneCliccato) {
        // Controlliamo se la posizione della label coincide con quella del bottone
        if (TALPA.getX() >= bottoneCliccato.getX() && 
            TALPA.getX() <= (bottoneCliccato.getX() + bottoneCliccato.getWidth()) &&
            TALPA.getY() >= bottoneCliccato.getY() &&
            TALPA.getY() <= (bottoneCliccato.getY() + bottoneCliccato.getHeight())) {
            
            punti += 10; // Guadagni 10 punti
            System.out.println("PRESA! Punti attuali: " + punti);
            
            // Facciamo sparire la label per un istante per dare feedback del colpo
            TALPA.setLocation(-100, -100); 
        } else {
            System.out.println("Mancata!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buca1;
    private javax.swing.JButton Buca2;
    private javax.swing.JButton Buca3;
    private javax.swing.JButton Buca4;
    private javax.swing.JLabel TALPA;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

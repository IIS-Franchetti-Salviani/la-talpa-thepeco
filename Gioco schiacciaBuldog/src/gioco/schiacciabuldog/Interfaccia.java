/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gioco.schiacciabuldog;

import java.awt.Image;
import javax.swing.Timer;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Davide
 */
public class Interfaccia extends javax.swing.JFrame {

    // Variabili per la logica
    private Giocatore player;
    private int bucaAttiva;
    private Random random = new Random();
    private int tempoRimanente = 30; // TIMER DI 30 SECONDI
    private Timer timerMovimento;
    private Timer timerPartita;

    public Interfaccia() {

        initComponents();

        player = new Giocatore("Utente");

        // Timer per muovere la talpa ogni secondo
        timerMovimento = new Timer(1000, e -> muoviTalpa());
        timerMovimento.start();

        // Timer per il countdown della partita
        timerPartita = new Timer(1000, e -> gestisciTempo());
        timerPartita.start();
    }

    private void muoviTalpa() {
        bucaAttiva = random.nextInt(4) + 1;
        TALPA.setText("TALPA!");
        TALPA.setVisible(true);

        // POSIZIONAMENTO SOPRA I BOTTONI
        JButton btnTarget;
        switch (bucaAttiva) {
            case 1 ->
                btnTarget = Buca1;
            case 2 ->
                btnTarget = Buca2;
            case 3 ->
                btnTarget = Buca3;
            default ->
                btnTarget = Buca4;
        }

        // Calcola la posizione: X uguale al bottone, Y un po' più in alto (-40)
        int xCentrata = btnTarget.getX() + (btnTarget.getWidth() / 2) - (TALPA.getWidth() / 2);
        // Y = y del bottone + (metà altezza bottone) - (metà altezza label)
        int yCentrata = btnTarget.getY() + (btnTarget.getHeight() / 2) - (TALPA.getHeight() / 2);

        TALPA.setLocation(xCentrata, yCentrata);
        TALPA.setVisible(true);

        this.getContentPane().setComponentZOrder(TALPA, 0);
        this.getContentPane().repaint();
    }
    
    private void aggiornaImmagineLabel() 
    {
        
    Image img = new ImageIcon("buca.png").getImage();
    Image imgRiscalata = img.getScaledInstance(TALPA.getWidth(), TALPA.getHeight(), Image.SCALE_SMOOTH);
    TALPA.setIcon(new ImageIcon(imgRiscalata));
    
    getContentPane().setComponentZOrder(TALPA, 0);
    getContentPane().setComponentZOrder(Buca1, 1);
    getContentPane().setComponentZOrder(Buca2, 1);
    getContentPane().setComponentZOrder(Buca3, 1);
    getContentPane().setComponentZOrder(Buca4, 1);
    getContentPane().repaint();
}

    private void gestisciTempo() {
        tempoRimanente--;
        lblTimer.setText("Tempo: " + tempoRimanente + "s");

        if (tempoRimanente <= 0) {
            timerMovimento.stop();
            timerPartita.stop();
            TALPA.setVisible(false);
            JOptionPane.showMessageDialog(this, "FINE PARTITA! Punteggio finale: " + player.getPunteggio());
        }
    }

    private void gestisciColpo(int indice) {

        if (indice == bucaAttiva && TALPA.isVisible()) {
            player.incrementaPunteggio(10);
            lblPunteggio.setText("Punti: " + player.getPunteggio());
            TALPA.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Buca4 = new javax.swing.JButton();
        Buca3 = new javax.swing.JButton();
        Buca1 = new javax.swing.JButton();
        TALPA = new javax.swing.JLabel();
        Buca2 = new javax.swing.JButton();
        lblPunteggio = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        getContentPane().setLayout(null);

        Buca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buca4ActionPerformed(evt);
            }
        });
        getContentPane().add(Buca4);
        Buca4.setBounds(420, 270, 160, 110);

        Buca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buca3ActionPerformed(evt);
            }
        });
        getContentPane().add(Buca3);
        Buca3.setBounds(120, 260, 160, 110);

        Buca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buca1ActionPerformed(evt);
            }
        });
        getContentPane().add(Buca1);
        Buca1.setBounds(120, 80, 160, 110);

        TALPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gioco/schiacciabuldog/talpabulldoggona.png"))); // NOI18N
        getContentPane().add(TALPA);
        TALPA.setBounds(-50, 190, 340, 200);

        Buca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buca2ActionPerformed(evt);
            }
        });
        getContentPane().add(Buca2);
        Buca2.setBounds(420, 80, 160, 110);
        getContentPane().add(lblPunteggio);
        lblPunteggio.setBounds(120, 520, 80, 16);
        getContentPane().add(lblTimer);
        lblTimer.setBounds(130, 590, 0, 0);
    }// </editor-fold>//GEN-END:initComponents

    int punti = 0;

    private void Buca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buca2ActionPerformed
        if (bucaAttiva == 1) {
            gestisciColpo(2);

        }
    }//GEN-LAST:event_Buca2ActionPerformed

    private void Buca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buca1ActionPerformed
        if (bucaAttiva == 1) {
            gestisciColpo(1);
        }
    }//GEN-LAST:event_Buca1ActionPerformed

    private void Buca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buca3ActionPerformed
        if (bucaAttiva == 1) {
            gestisciColpo(3);
        }
    }//GEN-LAST:event_Buca3ActionPerformed

    private void Buca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buca4ActionPerformed
        if (bucaAttiva == 1) {
            gestisciColpo(4);
        }
    }//GEN-LAST:event_Buca4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buca1;
    private javax.swing.JButton Buca2;
    private javax.swing.JButton Buca3;
    private javax.swing.JButton Buca4;
    private javax.swing.JLabel TALPA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblPunteggio;
    private javax.swing.JLabel lblTimer;
    // End of variables declaration//GEN-END:variables
}

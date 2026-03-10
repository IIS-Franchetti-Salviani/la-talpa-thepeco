/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gioco.schiacciabuldog;

/**
 *
 * @author pecorelli.davide
 */
public class Giocatore {
    
    private int punteggio;
    private String nome;

    public Giocatore(String nome) 
    {
        this.nome = nome;
        this.punteggio = 0;
    }

    public void incrementaPunteggio(int punti)
    { 
        this.punteggio += punti;
    }
    
    public int getPunteggio() 
    { 
        return punteggio;
    }
}

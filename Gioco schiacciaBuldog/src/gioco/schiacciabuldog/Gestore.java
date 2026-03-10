/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gioco.schiacciabuldog;
import java.util.ArrayList;
/**
 *
 * @author pecorelli.davide
 */
public class Gestore {
    
    private String difficolta;
    private int tempoRimanente;
    private ArrayList<Buca> listaBuche;
    private Giocatore giocatore;

    public Gestore(String difficolta, int tempo, Giocatore g) {
        
        this.difficolta = difficolta;
        this.tempoRimanente = tempo;
        this.giocatore = g;
        this.listaBuche = new ArrayList<>();
        
        for(int i=0; i<4; i++) listaBuche.add(new Buca());
    }
}

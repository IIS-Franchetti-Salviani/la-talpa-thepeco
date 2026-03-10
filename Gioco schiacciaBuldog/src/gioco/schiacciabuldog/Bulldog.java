/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gioco.schiacciabuldog;

/**
 *
 * @author pecorelli.davide
 */
public class Bulldog {
    
    protected int punteggio;
    protected String tipo;

    public Bulldog(String tipo) 
    {
        this.tipo = tipo;
        this.punteggio = 10; // Valore base
    }
    public void apparire() 
    { 
        
    }
    public void scomparire() 
    { 
        
    }
    public int getPunteggio() 
    { 
        return punteggio; 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gioco.schiacciabuldog;

/**
 *
 * @author pecorelli.davide
 */
public class Buca {
    
    private boolean occupata;
    private Bulldog BulldogContenuto;

    public Buca() 
    { 
        this.occupata = false; 
    }

    public void setBulldog(Bulldog t) 
    {
        this.BulldogContenuto = t;
        this.occupata = true;
    }

    public void resetBuca() 
    {
        this.occupata = false;
        this.BulldogContenuto = null;
    }

    public boolean isOccupata() 
    { 
        return occupata;
    
    }
    public Bulldog getTalpa() 
    { 
        return BulldogContenuto;
    }
}


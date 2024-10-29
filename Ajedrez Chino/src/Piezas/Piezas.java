/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas;

/**
 *
 * @author Hp
 */
public abstract class Piezas {
    public int xPos, yPos;
    
    protected boolean isRed;
    public String Ruta;

    public Piezas(int xPos, int yPos, boolean isRed) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.isRed = isRed;
    }
    
    
    
    public int getPosX(){
        return xPos;
    }
    public int getPos(){
        return yPos;
    }
    
    public boolean Color(){
        return isRed;
    }
    
    public abstract boolean mover(int xPos, int yPos, int X, int Y);
}

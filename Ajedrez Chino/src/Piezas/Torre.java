/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas;

/**
 *
 * @author Hp
 */
public class Torre extends Piezas {

    public Torre(int xPos, int yPos, boolean isRed) {
        super(xPos, yPos, isRed);
    }
     
    public boolean mover(int xPos, int yPos,int X, int Y) {
        if ((Y == yPos && X != xPos) || (X == xPos && Y != yPos)) {
            return true;
        }
        return false;
    }
    
}

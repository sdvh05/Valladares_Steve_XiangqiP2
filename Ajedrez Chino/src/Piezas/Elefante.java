/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas;

/**
 *
 * @author Hp
 */
public class Elefante extends Piezas {

    public Elefante(int xPos, int yPos, boolean isRed) {
        super(xPos, yPos, isRed);
    }
    
    public boolean mover(int xPos, int yPos,int X, int Y) {
        if (isRed) { //Rojo
            if (Y <= 5) { // terreno Rojo
                if (((X == (xPos + 1) || X == (xPos - 1)) && (Y == (yPos + 2) || Y == (yPos - 2))) /*movimiento L 1x 2y */
                        || ((X == xPos + 2) || X == (xPos - 2)) && (Y == (yPos + 1) || Y == (yPos - 1)) /*movimiento L 2x 1y */) {
                    return true;
                }
            }
            
        } else { //Negro
            if (Y >= 6) { //Terreno Negro
                if (((X == (xPos + 1) || X == (xPos - 1)) && (Y == (yPos + 2) || Y == (yPos - 2))) /*movimiento L 1x 2y */
                        || ((X == xPos + 2) || X == (xPos - 2)) && (Y == (yPos + 1) || Y == (yPos - 1)) /*movimiento L 2x 1y */) {
                    return true;
                }
            }
        }
        return false;
    }
}

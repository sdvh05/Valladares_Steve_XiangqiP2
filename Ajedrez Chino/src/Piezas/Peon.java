/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas;

/**
 *
 * @author Hp
 */
public class Peon extends Piezas {

    public Peon(int xPos, int yPos, boolean isRed) {
        super(xPos, yPos, isRed);
    }
    
    
    @Override
    public boolean mover(int xPos, int yPos,int X, int Y) {
        if (isRed) { //Roja
            if (Y <= 4) { //campo aliado
                if (Y > yPos && X == xPos && Y == (yPos + 1)) {
                    return true;
                }
            } else {// campo opuesto
                if (Y > yPos && X == xPos && Y == (yPos + 1)) { //vertical
                    return true;
                } else if ((Y == yPos && X == (xPos + 1)) || (Y==yPos && X == (xPos - 1))) { //horizontal
                    return true;
                }
            }

        } else { //Negra
            if (Y >= 5) { //campo aliado
                if (Y < yPos && X == xPos && Y == (yPos - 1)) {
                    return true;
                }
            } else {// campo opuesto
                if (Y < yPos && X == xPos && Y == (yPos - 1)) { //vertical
                    return true;
                } else if ((Y == yPos && X == (xPos + 1)) || (Y==yPos && X == (xPos - 1))) { //horizontal
                    return true;
                }
            }

        }
        return false; //no se puede mover
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piezas;
import Xiangqi.Tablero_Xiangqi;
import Xiangqi.Master;

/**
 *
 * @author Hp
 */
public class Controlador {

    public Master mas;

    public static String[][] tablero = new String[8][8];

    public Controlador() {
        iniciarTablero();
        new Tablero_Xiangqi(mas).setVisible(true);
//        añadirActionEvents();
//        movimientos = new Movimientos();
    }

    private void iniciarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = "";
            }
        }

        for (int i = 0; i < 9; i+=2) {
            tablero[3][i] = "N_peon";
            tablero[6][i] = "R_peon";
        }

        tablero[0][0] = "N_Torre";
        tablero[0][1] = "N_Caballo";
        tablero[0][2] = "N_Elefante";
        tablero[0][3] = "N_Oficial";
        tablero[0][4] = "N_Rey";
        tablero[0][5] = "N_Oficial";
        tablero[0][6] = "N_Elefante";
        tablero[0][7] = "N_Caballo";
        tablero[0][8] = "N_Torre";

        tablero[8][0] = "R_Torre";
        tablero[8][1] = "R_Caballo";
        tablero[8][2] = "R_Elefante";
        tablero[8][3] = "R_Oficial";
        tablero[8][4] = "R_Rey";
        tablero[8][5] = "R_Oficial";
        tablero[8][6] = "R_Elefante";
        tablero[8][7] = "R_Caballo";
        tablero[8][8] = "R_Torre";
    }

}

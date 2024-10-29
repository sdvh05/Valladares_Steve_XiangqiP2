/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xiangqi;

import java.time.LocalDate;

/**
 *
 * @author Hp
 */
public class Usuario {

    private String username;
    private String password;
    private int puntos;
    private String fecha;
    private int PartidasJugadas;
    private static final int PuntosPorVictoria=3;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
        this.puntos = 0;
        LocalDate fechaActual = LocalDate.now();
        this.fecha = fechaActual.toString();
        this.PartidasJugadas = 0;
    }

    //Getters
    public  final String getUser() {
        return username;
    }
    public final String getPass() {
        return password;
    }
    public final int getPuntos() {
        return puntos;
    }
    public final String getDate() {
        return this.fecha;
    }
    public final int getPJugadas() {
        return this.PartidasJugadas;
    }

    
    
    //Setters
    public void setUser(String username) {
        this.username = username;
    }

    public void setPass(String password) {
        this.password = password;
    }

    
    
    public void Victoria() {
        this.puntos += PuntosPorVictoria;
    }

    public void Jugar() {
        this.PartidasJugadas++;
    }

}

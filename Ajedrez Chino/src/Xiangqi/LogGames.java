/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xiangqi;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class LogGames implements LogPartidas {

    private static class LogEntry {

        String usuario1;
        String usuario2;
        String ganador;

        LogEntry(String usuario1, String usuario2, String ganador) {
            this.usuario1 = usuario1;
            this.usuario2 = usuario2;
            this.ganador = ganador;
        }

        public String getUsuario1() {
            return usuario1;
        }

        public String getUsuario2() {
            return usuario2;
        }

        public String getGanador() {
            return ganador;
        }

        @Override
        public String toString() {
            return "Jugador Rojo: " + usuario1 + " | Jugador Negro: " + usuario2 + " | Ganador: " + ganador;
        }
    }

    private ArrayList<LogEntry> logs;

    public LogGames() {
        logs = new ArrayList<>();
    }

    @Override
    public void agregarPartida(String usuario1, String usuario2, String ganador) {
        logs.add(0, new LogEntry(usuario1, usuario2, ganador));
    }

    @Override
    public String getLogs(String user) {
        StringBuilder sb = new StringBuilder("Historial de Partidas:\n");
        for (LogEntry log : logs) {
            if (log.getUsuario1().equals(user) || log.getUsuario2().equals(user)) {
                sb.append(log).append("\n");
            }
        }
        return sb.toString();
    }
}




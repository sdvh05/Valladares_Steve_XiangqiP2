/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xiangqi;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author Hp
 */
public class Master implements LogPartidas {
    
    public Usuario [] users;
    public int NumUsers=0;
     
    public Usuario UsuarioActual;
    public Usuario UsuarioRival;
    
     public LogGames logGames;
    
    
    public Master(){
        this.users=new Usuario[20];
        this.logGames = new LogGames();
    }
    
    
    //Login & Signin
        public boolean Login(String user, String pass){
        for (int i = 0; i < NumUsers; i++) {
            if(user.equals(users[i].getUser()) && pass.equals(users[i].getPass())){
              this.UsuarioActual=users[i]; 
              return true;  
            }
        } return false;
    }
    
    public boolean CrearCuenta(String usuario, String contra){
        for (int i = 0; i < NumUsers; i++) {
            if(users[i].getUser().equals(usuario)){
                return false;
            }  
        }
        Usuario newusers=new Usuario(usuario, contra);
        this.UsuarioActual= newusers;
        users[NumUsers]= newusers;
        NumUsers++;
        return true;  
    }
    
     public void Logout(){
      this.UsuarioActual=null;
  }  
           
     
public String obtenerRanking() {
    StringBuilder rankingBuilder = new StringBuilder();

    String[] ranking = new String[NumUsers];
    for (int i = 0; i < NumUsers; i++) {
        ranking[i] = users[i].getUser() + " - " + users[i].getPuntos();
    }

    Arrays.sort(ranking, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            int puntos1 = Integer.parseInt(o1.split(" - ")[1]);
            int puntos2 = Integer.parseInt(o2.split(" - ")[1]);
            return Integer.compare(puntos2, puntos1); 
        }
    });

    
    for (int i = 0; i < NumUsers; i++) {

        int posicion = i + 1;
        String[] userPuntos = ranking[i].split(" - ");
        rankingBuilder.append(posicion).append(") ").append(userPuntos[0]).append(" - ").append(userPuntos[1]).append(" pts\n");
    }

    return rankingBuilder.toString();
}



  
    @Override
    public void agregarPartida(String jugador1, String jugador2, String ganador) {
        logGames.agregarPartida(jugador1, jugador2, ganador);
    }

    @Override
    public String getLogs(String user) {
        return logGames.getLogs(user);
    }



       
         
}

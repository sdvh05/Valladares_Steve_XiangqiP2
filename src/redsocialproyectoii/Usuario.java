package redsocialproyectoii;
public class Usuario {
    private String nombre;
    private String user;
    private String pass;
    private String Genero;
    private int edad;
//    private boolean estado=false;
    
    public Usuario(String usuario, String contra,String genero,int edad){
        this.user=usuario;
        this.pass=contra;    
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}

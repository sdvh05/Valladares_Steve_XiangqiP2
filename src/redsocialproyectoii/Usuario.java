package redsocialproyectoii;
public class Usuario {
    public String nombre;
    public String user;
    private String pass;
    public String Genero;
    public int edad;
//    private boolean estado=false;
    
    public Usuario(String nombre, String usuario, String contra,String genero,int edad){
        this.nombre=nombre;
        this.user=usuario;
        this.pass=contra;
        this.Genero=genero;
        this.edad=edad;
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

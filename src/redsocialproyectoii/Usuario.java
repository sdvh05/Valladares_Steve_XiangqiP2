package redsocialproyectoii;
public class Usuario {
    public String nombre;
    public String user;
    private String pass;
    private String genero;
    private int edad;
    private String fecha;
    private boolean enLinea;
//    private boolean estado=false;
    
    public Usuario(String nombre, String usuario, String contra,String genero,int edad, String fecha){
        this.nombre=nombre;
        this.user=usuario;
        this.pass=contra;
        this.genero=genero;
        this.edad=edad;
        this.fecha=fecha;
    }

    public boolean isEnLinea() {
        return enLinea;
    }
    
    public void setUser(String user){
        this.user=user;
    }
    
    public String toString() {
        return user;
    }
    
    public String getPass() {
        return pass;
    }
}

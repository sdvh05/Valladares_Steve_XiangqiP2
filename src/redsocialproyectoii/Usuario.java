package redsocialproyectoii;
public class Usuario {
    private String nombre;
    private String user;
    private String pass;
    private String genero;
    private int edad;
    private String fecha;
//    private boolean estado=false;
    
    public Usuario(String nombre, String usuario, String contra,String genero,int edad, String fecha){
        this.nombre=nombre;
        this.user=usuario;
        this.pass=contra;
        this.genero=genero;
        this.edad=edad;
        this.fecha=fecha;
    }
    
    public void setUser(String user){
        this.user=user;
    }
    
    public String getUser() {
        return this.user;
    }
    
    public String getPass() {
        return pass;
    }
}

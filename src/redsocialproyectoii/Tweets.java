package redsocialproyectoii;

public class Tweets {
    private String texto;
    
    public Tweets(String text){
        this.texto=text;
    }
    
    public String getText(){
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}

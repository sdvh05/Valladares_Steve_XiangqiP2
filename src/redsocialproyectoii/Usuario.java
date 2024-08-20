package redsocialproyectoii;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Usuario {
    
    JTextField user;
    JPasswordField pass;
    
    Usuario(JTextField usuario, JPasswordField contra){
        this.user=usuario;
        this.pass=contra;
    }
    
    void setUser(JTextField usuario){
        this.user=usuario;
    }
    void setPasword(JPasswordField contra){
        this.pass=contra;
    }
    JTextField getUser(){
        return this.user;
    }
    JPasswordField getPassword(){
        return this.pass;
    }
}

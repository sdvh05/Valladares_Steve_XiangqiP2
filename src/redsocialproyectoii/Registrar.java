/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsocialproyectoii;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registrar {
    JTextField nombre;
    JTextField genero;
    JTextField usuario;
    JPasswordField contrasenia;
    JTextField edad;
    
    Registrar(JTextField name, JTextField gender, JTextField user, JPasswordField password, JTextField age){
        this.nombre=name;
        this.genero=gender;
        this.usuario=user;
        this.contrasenia=password;
        this.edad=age;
    }
    void setNombre(JTextField nombre){
        this.nombre=nombre;
    }
    void setGenero(JTextField genero){
        this.genero=genero;
    }
    void setEdad(JTextField edad){
        this.edad=edad;
    }
    void setUser(JTextField usr){
        this.usuario=usr;
    }
    void setPasword(JPasswordField contra){
        this.contrasenia=contra;
    }
    JTextField getUser(){
        return this.usuario;
    }
    JPasswordField getPassword(){
        return this.contrasenia;
    }
}

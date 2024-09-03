package redsocialproyectoii;

import javax.swing.ImageIcon;

public class AdminUsuarios {

    public Usuario[] Admin;

    public AdminUsuarios() {
        Admin = new Usuario[100];
    }
    
    public Usuario BuscarUsuario(String user) {
        for (Usuario search : Admin) {
            if (search!=null && search.toString().equals(user)) {
                return search;
            }
        }
        return null;
    }

    public boolean AgregarUsuario(String name, String user, String password,String genero,int edad, String fecha) {
        if (BuscarUsuario(user) == null) {
            for (int i = 0; i < Admin.length; i++) {
                if (Admin[i] == null) {
                    Admin[i] = new Usuario(name, user, password,genero,edad, fecha);
                    if(genero.equals("Masculino")){
                        ImageIcon profile = new ImageIcon("pfp-man.jpg");
                        profile.setImage(profile.getImage());
                    }else{
                        ImageIcon profile = new ImageIcon("pfp-woman.jpg");
                        profile.setImage(profile.getImage());
                    }
                    return true;
                }
            }
        }
        return false;
    }
            
}

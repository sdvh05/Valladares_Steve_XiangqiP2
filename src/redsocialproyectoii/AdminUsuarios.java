package redsocialproyectoii;

public class AdminUsuarios {
    private static  AdminUsuarios instance;
    public Usuario[] Admin;

    public AdminUsuarios() {
        Admin = new Usuario[100];
    }
    
    public static AdminUsuarios getInstance(){
        if (instance==null) {
            instance = new AdminUsuarios();
        }
        return instance;
    }
    
    public boolean AgregarUsuario(String name, String user, String password,String genero,int edad, String fecha) {
        if (BuscarUsuario(user) == null) {
            for (int i = 0; i < Admin.length; i++) {
                if (Admin[i] == null) {
                    Admin[i] = new Usuario(name, user, password, genero, edad, fecha);
                    return true;
                }
            }
        }
        return false;
    }
    public Usuario BuscarUsuario(String user) {
        for (Usuario search : Admin) {
            if (search != null && search.getUser().equals(user)) {
                return search;
            }
        }
        return null;
    }
}

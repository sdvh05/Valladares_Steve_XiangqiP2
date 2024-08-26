package redsocialproyectoii;

public class AdminUsuarios {

    Usuario[] Admin;

    public AdminUsuarios() {
        Admin = new Usuario[100];
    }
//    void Print() {
//        for (Usuario i : Admin) {
//            if (i != null) {
//                System.out.println(i.getUser());
//            }
//        }
//    }
    boolean AgregarUsuario(String name, String nombre, String password,String genero,int edad) {
        if (BuscarUsuario(nombre) == null) {
            for (int i = 0; i < Admin.length; i++) {
                if (Admin[i] == null) {
                    Admin[i] = new Usuario(name, nombre, password,genero,edad);
                    return true;
                }
            }
        }
        return false;
    }

    Usuario BuscarUsuario(String nombre) {
        for (Usuario myArrays : Admin) {
            if (myArrays != null && myArrays.getUser().equals(nombre)) {
                return myArrays;
            }
        }
        return null;
    }
}

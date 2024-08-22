package redsocialproyectoii;

public class AdminUsuarios {

    Usuario[] Admin;

    public AdminUsuarios() {
        Admin = new Usuario[100];
    }
//
//    void Print() {
//        for (Usuario Admin1 : Admin) {
//            if (Admin1 != null) {
//                System.out.println(Admin1.getUser());
//            }
//        }
//    }

    Usuario BuscarUsuario(String nombre) {
        for (Usuario ubicacion : Admin) {
            if (ubicacion != null && ubicacion.getUser().equals(nombre)) {
                return ubicacion;
            }
        }
        return null;
    }

    boolean AgregarUsuario(String nombre, String password,String genero,int edad) {
        if (BuscarUsuario(nombre) == null) {
            for (int i = 0; i < Admin.length; i++) {
                if (Admin[i] == null) {
                    Admin[i] = new Usuario(nombre, password,genero,edad);
                    return true;
                }
            }
        }

        return false;
    }

}

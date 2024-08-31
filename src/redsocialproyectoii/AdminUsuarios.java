package redsocialproyectoii;

public class AdminUsuarios {

    private Usuario[] Admin;

    public AdminUsuarios() {
        Admin = new Usuario[100];
    }
    
    public Usuario BuscarUsuario(String user) {
        for (Usuario search : Admin) {
            if (search!=null && search.getUser().equals(user)) {
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
                    return true;
                }
            }
        }
        return false;
    }
//    public Usuario verLongitud(String user){
//        for(int posicion=0;posicion<arreglo.Admin.length;posicion++){
//            for(int i=0;i<Admin[posicion].toString().length()-1;i++){
//                if (Admin[i].toString().charAt(i) == tuRespuesta) {
//                    letras[i] = tuRespuesta;  
//                    verificacion = true;
//                    System.out.println("Adivinaste!");
//                }
//            }
//            if(Admin[posicion]==null){
//                break;
//            }
//        }
//    }
}

package redsocialproyectoii;

public class AdminUsuarios {

    private Usuario[] Admin;

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
    public Usuario BuscarUsuario(String user) {
        for (Usuario search : Admin) {
            //hay un error con el arreglo ya que da nulo
            if (search!=null && search.getUser().equals(user)) {
                return search;
            }
        }
        return null;
    }

    /**
     *
     * @param name
     * @param user
     * @param password
     * @param genero
     * @param edad
     * @return
     */
    public boolean AgregarUsuario(String name, String user, String password,String genero,int edad) {
        if (BuscarUsuario(user) == null) {
            for (int i = 0; i < Admin.length; i++) {
                if (Admin[i] == null) {
                    Admin[i] = new Usuario(name, user, password,genero,edad);
                    return true;
                }
            }
        }
        return false;
    }
}

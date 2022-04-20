package co.com.devco.model;

public class Usuario {
    private String usuario;
    private String password;

    //private Usuario instancia;

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public static Usuario deRol(String rol){
        if ("admin".equals(rol)){
            return new Usuario("admin", "admin");
        } else if ("natural".equals(rol)) {
            return new Usuario ("camilo", "123");
        }else{
            return new Usuario("pepe", "pepe");
        }
    }

    /*private Usuario fabrica(String usuario, String password){
        if (instancia.getUsuario().equals(usuario)){
            return instancia;
        }else{
            Usuario us = new Usuario(usuario, password);
            this.instancia = us;
            return us;
        }
    }*/
}

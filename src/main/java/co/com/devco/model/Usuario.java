package co.com.devco.model;

public class Usuario {
    private String usuario;
    private String password;

    private String rol;

    public Usuario(String usuario, String password, String rol) {
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }

    public Usuario(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getRol() {
        return rol;
    }

    public void setUsPw(){
        if ("admin".equals(this.rol)){
            this.usuario = "admin";
            this.password = "admin";
        } else{
            this.usuario = "dummy";
            this.password = "dummy";
        }
    }
}

package co.com.devco.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioFactory {

    private static List<Usuario> usuarios = new ArrayList<Usuario>();

    public static Usuario delRol(String rol){
        if (usuarios.isEmpty()){
            Usuario us = new Usuario(rol);
            us.setUsPw();
            usuarios.add(us);
        }else{
            usuarios.forEach(usuario -> {
                if (!usuario.getRol().equals(rol)){
                    Usuario us = new Usuario(rol);
                    us.setUsPw();
                    usuarios.add(us);
                }
            });
        }

        return usuarios.stream().filter(us -> us.getRol().equals(rol)).findFirst().get();
    }
}

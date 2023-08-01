package Validaciones;

import org.example.Utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    private Util util = new Util();

    // Metodos Ordinarios
                                //Parametros
    public Boolean validarNombre(String nombre) throws Exception{

        if (!util.buscarCoincidencia(nombre, "^[a-zA-Z]+$")){
            throw new Exception("Revise el NOMBRE");
        }

        if (nombre.length()<10){
            throw new Exception("Numero de caracteres debe ser minimo 10");
        }
        return true;

    }
    public Boolean validarUbicacion(Integer ubicacion) {
        return true;
    }
    public Boolean validarCorreo(String correo) throws Exception{
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(correo);

        if (coincidencia.matches()){
            return true;
        }else{
            throw new Exception("Debe ingresar un correo valido");
        }
    }

}

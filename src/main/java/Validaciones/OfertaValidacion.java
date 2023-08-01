package Validaciones;

import java.time.LocalDate;

public class OfertaValidacion {

    public Boolean validarTitulo(String titulo){
        return true;
    }
    public Boolean validarFechaI_F(LocalDate fecha_inicio, LocalDate fecha_fin){
        return true;
    }
    public Boolean validarFecha(LocalDate fecha){
        return true;
    }
    public Boolean validarCosto(Integer costo){
        return true;
    }

}

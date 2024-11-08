package co.edu.barriosoft.barriosoft.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaUtils {

    public static final String FORMATO_FECHA = "dd/MM/yyyy";

    private FechaUtils(){
    }

    public static String formatearFecha(LocalDate fecha,String formato){
        return fecha.format(DateTimeFormatter.ofPattern(formato));
    }
}


package laboratorio2;
import java.util.*;

public class csBisiesto {
    private int anio;
    private String tipoAnio;
    
    public csBisiesto(){        
    }
    public void setanio(int ano){
        anio = ano;        
    }
    
    public String getanio(){
        return tipoAnio;
    }
    public void calcularBisiesto(){
        GregorianCalendar calendar = new GregorianCalendar();

        if (calendar.isLeapYear(anio))
            tipoAnio = "El año es bisiesto";
        else
            tipoAnio = "El año no es bisiesto";
    }
         
}


package laboratorio2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class csEdad {
    String fechaNacimiento;
    
    public csEdad(){}
    
    public void setedad(String fecnac){
        fechaNacimiento = fecnac;                
    }
    
    public String calcularEdad(){
        String texto ="";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        texto = ("Tu edad es: "+ periodo.getYears() + " años "+ periodo.getMonths()+" meses "+ periodo.getDays()+" dias");
                    
        return texto;
    }       
}

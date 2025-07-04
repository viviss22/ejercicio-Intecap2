
package laboratorio2;
import java.util.Scanner;

public class csTabla {
    int numero;
    
    public csTabla(int n){
        numero = n;
    }
    
    public void calcularTabla(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" +i+"="+(i*numero));
        }
        
    }
}

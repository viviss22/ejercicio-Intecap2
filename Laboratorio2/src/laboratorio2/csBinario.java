
package laboratorio2;

public class csBinario {
    private int numero;
    
    public csBinario(){}
    
    public void setvbinario(int bina){
        numero = bina;
    }
    
    public double calcularBinario(){        
        int n, exp = 0, digito=0;
        double binario = 0;
        
        n = numero;
        while(n!=0){
            digito = n % 2;           
            binario = binario + digito * Math.pow(10, exp);                                                   
            exp++;
            n = n/2;            
        }
        
        return binario;
    }
    
    
}

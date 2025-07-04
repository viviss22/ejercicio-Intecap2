
package laboratorio2;

public class csCombinacion {
    private double n,x;
    
    public csCombinacion(double n,double x){
        this.n = n;
        this.x = x;
    }
    
    public double calcularCombinacion(){
        double valor = 0,menos;
        menos = n-x;
        valor = factorial(n)/(factorial(x)*factorial(menos));
        return valor;
    }
    
    private double factorial(double n){
        double resultado= 1;
        for (double i=n;i >=1; i--){
            resultado = resultado * i;            
        }                
        return resultado;
    }    
}

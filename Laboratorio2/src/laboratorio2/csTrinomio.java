
package laboratorio2;

public class csTrinomio {
    private double a,b;
    
    public csTrinomio(){
        a=0;
        b=0;
    }
    
    public void seta(double a1){
        a=a1;
    }
    public void setb(double a1){
        b=a1;
    }
    
    public double calcularTrinomio(){
        double resultado = 0;
        resultado = Math.pow((a+b), 2);
        return resultado;
    }
}

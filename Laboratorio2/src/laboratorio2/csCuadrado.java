
package laboratorio2;

public class csCuadrado {
    private double base,altura,diagonal,area,perimetro;    
    
    public csCuadrado(){}
    
    public void setbase(double b){base = b;}    
    public void setaltura(double a){altura = a;}
    
    public void calcularDiagonal(){
        diagonal = Math.pow(base, 2) + Math.pow(altura, 2);        
    }
    
    public void calcularPerimetro(){
        perimetro = 2*(base+altura);        
    }
    
    public void calcularArea(){
        area =base * altura;        
    }
    
    public double getdiagonal(){ return diagonal;}
    public double getperimetro(){ return perimetro;}
    public double getarea(){ return area;}
}

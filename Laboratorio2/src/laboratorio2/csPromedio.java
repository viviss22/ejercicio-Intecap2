
package laboratorio2;


public class csPromedio {
    public float nota1, nota2, nota3,nota4;
    
    public csPromedio(float n10,float n20,float n30, float n40){
        this.nota1 = n10;
        this.nota2 = n20;
        this.nota3 = n30;
        this.nota4 = n40;        
    }
    
    public boolean calcularAprobado(){
        float promedio = 0;
        boolean vf;
        promedio = (nota1 + nota2 + nota3 +nota4)/4;
        if (promedio > 61){
            vf= true;
        }else{
            vf = false;
        }        
        return vf;
    }
    
}

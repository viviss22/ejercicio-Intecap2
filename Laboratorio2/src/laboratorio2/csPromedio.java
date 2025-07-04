
package laboratorio2;


public class csPromedio {
    public float nota1, nota2, nota3,nota4;
    
    public csPromedio(float n1,float n2,float n3, float n4){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.nota4 = n4;        
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

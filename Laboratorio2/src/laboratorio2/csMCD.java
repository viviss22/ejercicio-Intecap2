
package laboratorio2;


public class csMCD {
    private int numero;

    public csMCD(){}
    
    public void setnumero(int n){numero = n;}
    
    public String calcularMCD(){
        String texto= "";
        for (int i = 1; i <= numero; i++) {
            if(numero%i== 0){
                texto = texto + " "+ i; 
            }                       
        }
        return texto;
    }
    
}


package laboratorio2;


public class csFutbol {
    public String nombreEquipo1,nombreEquipo2;
    public int marcadorEquipo1,marcadorEquipo2;
    
    public csFutbol(){
        nombreEquipo1="";
        nombreEquipo2="";
        marcadorEquipo1= 0;
        marcadorEquipo2= 0;
    }    
    
    public void setnombreEquipo1(String nombre){
        nombreEquipo1 = nombre;
    }
    public void setnombreEquipo2(String nombre){
        nombreEquipo2 = nombre;
    }
    public void setnmarcador1(int marcador){
        marcadorEquipo1 = marcador;
    }
    public void setnmarcador2(int marcador){
        marcadorEquipo2 = marcador;
    }    
    public String calcularGanador(){
        String texto= "";
        if (marcadorEquipo1 > marcadorEquipo2){
            texto = "Equipo 1";
        }else if(marcadorEquipo1 < marcadorEquipo2){
            texto = "Equipo 2";
        }else{
            texto = "Empate";
        }
        
        return texto;
    }
    
}

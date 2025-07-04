
package laboratorio2;
import java.util.*;


public class Laboratorio2 {
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();                
    }    
    
    public static void menu(){
        System.out.println("Menu Principal");
        System.out.println("1. Calcular Promedio");
        System.out.println("2. Marcador de Futbol");
        System.out.println("3. Trinomio Cuadrado Perfecto");
        System.out.println("4. Año bisiesto");
        System.out.println("5. Multiplicacion");
        System.out.println("6. Maximo Comun divisor");
        System.out.println("7. Formula del cuadrado");
        System.out.println("8. Formula Combinacion");
        System.out.println("9. Convertir a Binario");        
        System.out.println("10. Calcular Edad");
        System.out.println("11. Salir");        
        
        int opcion = in.nextInt();
        
        switch(opcion){
            case 1: promedio(); menu(); break;
            case 2: futbol(); menu(); break;
            case 3: trino(); menu(); break;
            case 4: bisi(); menu(); break;
            case 5: multi(); menu(); break;
            case 6: mcd(); menu(); break;
            case 7: cuadra(); menu(); break;
            case 8: combi(); menu(); break;
            case 9: bina(); menu(); break;
            case 10: edad(); menu(); break;
            case 11: System.out.println("Salida del sistema"); break;
            default: System.out.println("Salida del sistema"); menu(); break;                                            
        }
    }
    
    public  static  void edad(){
        csEdad obje = new csEdad();
        System.out.println("Calcular Edad");        
        System.out.println("Ingrese fecha de nacimiento");        
        obje.setedad(in.next());
        System.out.println(obje.calcularEdad());
    }
    
    public static void bina(){
        csBinario objbi = new csBinario();
        System.out.println("Calcular Binario");        
        System.out.println("Ingresar numero a convertir");        
        objbi.setvbinario(in.nextInt());
        
        System.out.println("El Binario es: " + objbi.calcularBinario());
    }
    
    public static void combi(){
        double x=0,n=0;
        System.out.println("Calcular Formula Combinacion");        
        System.out.println("Ingresar x");        
        x = in.nextDouble();
        System.out.println("Ingresar n");        
        n = in.nextDouble();
        csCombinacion objcom = new csCombinacion(n,x);        
        System.out.println("El resultado es: "+ objcom.calcularCombinacion());
    }
    public static void cuadra(){
        csCuadrado objcua = new csCuadrado();
        System.out.println("Calcular Formula cuadrada");        
        System.out.println("Ingresar Altura");
        objcua.setaltura(in.nextDouble());
        System.out.println("Ingresar Base");
        objcua.setbase(in.nextDouble());
        
        objcua.calcularDiagonal(); objcua.calcularArea(); objcua.calcularPerimetro();
        
        System.out.println("Los resultados son: ");        
        System.out.println("Area.....: "+ objcua.getarea());
        System.out.println("Diagonal.: "+ objcua.getdiagonal());
        System.out.println("Perimetro: "+ objcua.getperimetro());                
    }
    
    public static void mcd(){                
        csMCD objmcd = new csMCD();
        System.out.println("Calcular MCD");
        System.out.println("Ingrese el numero");               
        objmcd.setnumero(in.nextInt());
        System.out.println("Los numeros son: "+objmcd.calcularMCD());
    }
    
    public static void multi(){
        int n;
        System.out.println("Calcular Tabla");
        System.out.println("Ingrese el numero a calcular");
        n = in.nextInt();
        
        csTabla objta = new csTabla(n);
        
        objta.calcularTabla();        
    }
    
    public static void bisi(){
        int anio;
        System.out.println("Calcular si es Bisiesto");
        System.out.println("Ingrese el año");
        anio = in.nextInt();
        
        csBisiesto objanio = new csBisiesto();
        objanio.setanio(anio);
        objanio.calcularBisiesto();
        
        System.out.println(objanio.getanio());        
    }
    
    public static void trino(){
        double a,b;
        System.out.println("Calcular trinomio cuadrado perfecto");
        System.out.println("Ingrese el valor de a ");
        a= in.nextDouble();
        System.out.println("Ingrese el valor de b ");
        b= in.nextDouble();
        
        csTrinomio objtri = new csTrinomio();
        objtri.seta(a);
        objtri.setb(b);
        
        System.out.println("El cuadrado perfecto es: " + objtri.calcularTrinomio());
        
    }
    
    public static void promedio(){
        float [] notas =  new float[4];
               
        System.out.println("Calcular promedio");
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese la nota No. "+ (i+1));
            notas[i]= in.nextFloat();                        
        }
                
        csPromedio objPro = new csPromedio(notas[0],notas[1],notas[2],notas[3]);                
        System.out.println("El alumno aprobo: " + objPro.calcularAprobado());
    }
    
    public static void futbol(){
        String [] nombre =  new String[2];
        int [] marcaje =  new int[2];
        System.out.println("Calcular promedio");
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese El nombre del equipo "+ (i+1));
            nombre[i]= in.next();
            System.out.println("Ingrese El marcaje del equipo "+ (i+1));
            marcaje[i]= in.nextInt();            
        }  
        
        csFutbol objfutbol = new csFutbol();
                
        objfutbol.setnombreEquipo1(nombre[0]);
        objfutbol.setnombreEquipo1(nombre[1]);
        objfutbol.setnmarcador1(marcaje[0]);
        objfutbol.setnmarcador2(marcaje[1]);
        
        System.out.println("El ganador es: "+ objfutbol.calcularGanador());
    }
}

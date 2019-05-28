
package seno;


public class Seno {

   
    public static void main(String[] args) {
        
        System.out.println("facotrial de 0 "+factorial(0));
        for(int i=1;i<=13;i+=2){
        System.out.println("factorial de "+i+" "+factorial(i)); 
        }
        System.out.println(numeroImpares(2));
            
        System.out.println("El calculo del exponente es "+calculaExponente(2, 5));
        
        imprimeImpares(13);
        
        
    }
    
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static int numeroImpares(int n){
        int operacion=1;
        for (int i=1; i<=n;i++){
         operacion= 2*i-1;
        }
        return operacion;
    }
    
    public static int calculaExponente(int base,int exponente){
        int resultado=0;
        resultado = (int)Math.pow(base, exponente);
        return resultado;
    }
    
    public static void imprimeImpares(int a){
        int i;
        for (i=1;i<=a;i+=2)
            System.out.println(i);
    }
    
}

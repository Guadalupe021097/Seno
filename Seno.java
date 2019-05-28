package seno;

/**
 *
 * @author lupii
 */
public class Seno {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
//        System.out.println("Factorial de 0 "+factorial(0));
//        for(int i=1;i<=13;i+=2){
//        System.out.println("Factorial de "+i+" "+factorial(i)); 
//        }
//        System.out.println("Numero impar  "+CalculaNumeroImpar(2));
//            
//        System.out.println("Exponente de 2 ^ 5 =  "+CalculaExponente(2, 5));
        
       // imprimeImpares(13);
        CalculaSeno();
        
    }
    
//    public static long factorial(int n) {
//        long resultado = 1;
//        for (int i = 1; i <= n; i++) {
//            resultado *= i;
//        }
//        return resultado;
//    }
    public static double factorial(int con, int n) {
        if (con > n) {
            return 1;
        }
        return con *= factorial(con += 1, n);
    }
/**
 * @param n numero impar de la funcion
 * @return operacion si el numero es par o impar  
    */
    public static int CalculaNumeroImpar(int n) {
        int operacion = 1;
        for (int i = 1; i <= n; i++) {
            operacion = 2 * i - 1;
        }
        return operacion;
    }

    public static int CalculaExponente(int base, int exponente) {
        int resultado = 0;
        resultado = (int) Math.pow(base, exponente);
        return resultado;
    }

    public static void imprimeImpares(int a) {
        int i;
        System.out.println("Numero impar");
        for (i = 1; i <= a; i += 2) {
            System.out.println(i);
        }
    }

    public static void CalculaSeno() {
        int x = 1;
        boolean signo = true;
        double expo, fact, result, valor = 0;
        for (int i = 1; i <= 13; i += 2) {
            expo = Math.pow(x, i);//Math.pow devuelve la base elevada al exponente, esto es, baseesponente
            fact = factorial(1, i);
            result = expo / fact;
            if (signo) {
                valor += result;
                signo = false;
            } else {
                valor -= result;
                signo = true;
            }
        }
        System.out.println("f(" + x + ") = " + valor+ " radianes");
    }
}

public class Factorial {
    public static void main(String[] args) {
        int numero = 5;
        int factorial = 1;
        int i = numero;
        while (i > 1) {
            factorial*=i;
            i--;
        }
        System.out.println("El factorial de " + numero + 
        " es " + factorial);
    }
}

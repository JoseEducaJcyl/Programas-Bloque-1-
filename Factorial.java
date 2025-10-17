public class Factorial {
    public static void main(String[] args) {
    // Declaramos la variable 'numero' cuyo factorial queremos calcular
    int numero = 5;

    // Inicializamos la variable 'factorial' en 1, 
    // ya que es el elemento neutro de la multiplicación
    int factorial = 1;

    // Declaramos una variable auxiliar 'i' que usaremos para el bucle
    int i = numero;

    // Mientras 'i' sea mayor que 1, multiplicamos 'factorial' por 'i'
    // y luego decrementamos 'i' en 1 en cada iteración
    while (i > 1) {
        factorial *= i; 
        i--;
    }

    // Mostramos el resultado del factorial en consola
    System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
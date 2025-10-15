import java.util.Scanner;

public class BuscarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1,4,7,2,5,8};
        System.out.println("Ingrese un numero: ");
        int numeroBuscar = scanner.nextInt();
        int encontrado = 0;
        int posicion = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == numeroBuscar){
                encontrado = numeros[i];
                posicion = i + 1;
            }
        }
        System.out.println("El numero " + encontrado + 
        " se encuentra en la posicion " + posicion);
    }
}

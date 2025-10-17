import java.util.Scanner;

public class BuscarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaramos un array de numeros
        int[] numeros = {1,4,7,2,5,8};
        //Pedimos al usurio un numero 
        System.out.println("Ingrese un numero: ");
        int numeroBuscar = scanner.nextInt();
        //Declaramos las variables de encontrado y posicion
        int encontrado = 0;
        int posicion = 0;
        //Se busca en el array a traves de un for 
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == numeroBuscar){
                encontrado = numeros[i];
                posicion = i + 1;
            }
        }
        //Se muestra el  numero y la posicion
        System.out.println("El numero " + encontrado + 
        " se encuentra en la posicion " + posicion);
        scanner.close();
    }
}

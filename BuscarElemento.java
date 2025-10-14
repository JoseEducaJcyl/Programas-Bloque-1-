import java.util.Scanner;

public class BuscarElemento {
    public static void main(String[] args) {
        //Importamos el scanner
        Scanner scanner = new Scanner(System.in);

        //Le pedimos al usuario la dimension del array
        System.out.println("Inserte dimension del array ");
        int dimension = scanner.nextInt();
        int[] numeros = new int[dimension];
        //Le pedimos al usuario rellenar el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor: ");
            numeros[i]=scanner.nextInt();
        }
        //Le pedimos al usuario el elemento que quiera ver
        System.out.println("Inserta el elemento que quieres ver: ");
        int elemento = scanner.nextInt();
        //Inicializamos una variable posicion a -1 por si no encuentra
        //la posicion 
        int posicion=-1;
        //Buscamos el elemento
        for (int i = 0; i < numeros.length; i++) {
            if(elemento == numeros[i]){
                posicion = i+1;
                System.out.println("Posicion: " + (posicion));
                System.out.println("Elemento:" + numeros[i]);
            }
        }
        if(posicion==-1){
            System.out.println("Valor no encontrado");
        }
    }
}

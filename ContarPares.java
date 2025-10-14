import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        //Version preguntando al usuario la longitud del array
        //y insertando los valores
        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte dimension del array: ");
        int dimension = scanner.nextInt();
        int[] numeros = new int[dimension];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor: ");
            numeros[i]=scanner.nextInt();
        }
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                pares++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("Total de pares: " + pares);
        */
        //Version simple
        int[] numeros = {1,2,3,4,5};
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                pares++;
            }
        }
        System.out.println("Total pares: " + pares);
    }    
}

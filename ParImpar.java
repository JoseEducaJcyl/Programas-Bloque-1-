import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();

        if(numero == 0) {
            System.out.println("El numero es cero"); 
        }else if(numero % 2 == 0){
            System.out.printf("El numero %d es par",numero);
        }else{
            System.out.printf("El numero %d es impar",numero);
        }
    }    
}

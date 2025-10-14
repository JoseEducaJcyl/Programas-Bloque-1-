import java.util.Random;
import java.util.Scanner;

public class ChequeaMultiplo {
    public void esMultiplo(int numero) {
        Random random = new Random();
        int parametro = random.nextInt(10);
        while (parametro != 0) {
            if(numero % parametro == 0){
                System.out.println("El numero " + numero + " es multiplo de " +
                parametro);
                break;
            }else{
                System.out.println("El numero " + numero + " no es multiplo de " +
                parametro);
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = scanner.nextInt();
        ChequeaMultiplo m = new ChequeaMultiplo();
        m.esMultiplo(numero);
        scanner.close();
    }
}


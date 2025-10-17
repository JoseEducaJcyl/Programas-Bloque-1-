import java.util.Scanner;

public class ConversorBases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedimos al usuario un numero decimal 
        System.out.println("Introduce un numero: ");
        int numeroDecimal = scanner.nextInt();
        /*Pedimos al usuario si quiere convertirlo a Binario,
         Octal o Hexadecimal 
        */
        System.out.println("Convertir a binario, octal o hexadecimal? ");
        System.out.println("[1] Binario");
        System.out.println("[2] Octal");
        System.out.println("[3] Hexadecimal");
        System.out.println("Ingrese opcion: ");
        int opcion = scanner.nextInt();
        /*A traves de un switch convetimos el numero decimal a la opcion 
        que el usuario eligio y lo mostramos 
        */
        switch(opcion){
            case 1: {
                System.out.println("El numero a Binario seria: ");
                System.out.println(Integer.toBinaryString(numeroDecimal));
                break;
            }
            case 2: {
                System.out.println("El numero a Octal seria: ");
                System.out.println(Integer.toOctalString(numeroDecimal));
                break;
            }
            case 3: {
                System.out.println("El numero a Hexadecimal seria: ");
                System.out.println(Integer.toHexString(numeroDecimal));
                break;
            }
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int resultado = 0;
        boolean entradaValida = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numA = scanner.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int numB = scanner.nextInt();

        System.out.println("Seleccione calculo (+,-,*,/)");
        while (!entradaValida) {
            String opcion = scanner.nextLine();
            switch (opcion) {
            case "+":
                resultado = numA + numB;
                entradaValida = true;
                break;
            case "-":
                resultado = numA - numB;
                entradaValida = true;
                break;
            case "*":
                resultado = numA * numB;
                entradaValida = true;
                break;
            case "/":
                try{
                resultado = numA / numB;
                entradaValida = true;
                }catch (ArithmeticException e) {
                    System.out.println("No se puede dividir entre cero");
                    if(numA == 0 || numB == 0)
                        System.out.println("Introduce el primer numero: ");
                        numA = scanner.nextInt(); 
                        System.out.println("Introduce el segundo numero: ");
                        numB = scanner.nextInt(); 
                        resultado = numA / numB;
                        entradaValida = true;
                    break; 
                }
            }
        }
        System.out.println("El resultado del calculo es: " + resultado);
    }
}

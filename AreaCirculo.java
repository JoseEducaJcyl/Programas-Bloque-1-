/*
Programa que calcula el área de un circulo 
*/
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		//Se crea un objeto Scanner		  
		
		System.out.println("Introduce el área del circulo: ");	//Se pide al usuario introducir el área del circulo		
		double radio = scanner.nextDouble();							
		
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El área del circulo es: " + area); 
	}
}
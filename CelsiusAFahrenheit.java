import java.util.Scanner;
public class CelsiusAFahrenheit {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce los Celsius: ");
		
		double celsius = scanner.nextDouble();
		
		double Fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("La conversión a Fahrenheit seria: " + Fahrenheit); 
	}
}
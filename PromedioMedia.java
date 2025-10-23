public class PromedioMedia {
        public static void main(String[] args) {
        //Declaramos un array de numeros    
        int[] numeros = {8, 3, 5, 1, 9, 7, 2};
        //Declaramos una variable que sera la longitud del array        
        int longitud = numeros.length;
        //Declaramos un acumulador
        int suma = 0;

        // Calculamo el  promedio del array
        for (int i = 0; i < longitud; i++) {
            suma += numeros[i];
        }
        double promedio = (double) suma / longitud;

        // Calculamos la media del array, se comprueba si el par la longitud
        //del array 
        double mediana;
        if (longitud % 2 == 0)
            mediana = (numeros[longitud/2 - 1] + numeros[longitud/2]) / 2.0;
        else
            mediana = numeros[longitud/2];

        // Mostramos los resultados
        System.out.println("Promedio: " + promedio);
        System.out.println("Mediana: " + mediana);
    }
}

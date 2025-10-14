public class Suma {
    public static void main(String[] args) {
        //Creamos un array con una dimension 5
        int numeros[] = {1,4,7,5,8};
        //Creamos una variable acumulador  
        int suma = 0;
        //Recorremos el array y le sumamos el valor al acumulador
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        } 
        //Imprimimos los valores del array y el acumulador
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("Suma total: " + suma);
    }    
}

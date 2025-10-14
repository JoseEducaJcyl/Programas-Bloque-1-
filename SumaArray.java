public class SumaArray {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int resultado = sumaArray(numeros);
        System.out.println("La suma total es: " + resultado);
    }
    public static int sumaArray (int[] numeros) {
        int sumaTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaTotal+=numeros[i];
        }
        return sumaTotal;
    }
}
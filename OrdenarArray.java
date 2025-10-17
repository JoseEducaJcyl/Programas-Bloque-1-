import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        //Declaramos un array de numeros desordenados
        int[] numeros = {1,4,5,7,8,2,9,3};
        //Usamos la clase Arrays para ordenarlos
        Arrays.sort(numeros);
        //Mostramos el array ordenado con Arrays.toString()
        System.out.println(Arrays.toString(numeros));
    }
}

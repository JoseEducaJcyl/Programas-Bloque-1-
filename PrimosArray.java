public class PrimosArray {
    public static void main(String[] args) {
        //Declaramos un array de numeros
        int[] numeros = {2,5,8,10,13,16,19};
        //A traves de un for divimos el numero entre 2
        /*Si el resto de la division es diferente a 0
        el numero es primo*/
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 != 0){
                System.out.println("El Numero " + numeros[i] + " es primo");
            }
        }
    }
}

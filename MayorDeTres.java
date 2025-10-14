public class MayorDeTres {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int[] numeros = new int[3];
        numeros[0] = a;
        numeros[1] = b;
        numeros[2] = c;
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > mayor) {
                mayor = numeros[i];
            }
        } 
        System.out.println("El mayor es " + mayor);
    }
}

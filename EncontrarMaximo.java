public class EncontrarMaximo {
    public static void main(String[] args) {
        int[] numeros = {6,5,2,10,3,4,7};
        int maximo = 0;
        int posicion = 1;
        for (int i = 0; i < numeros.length; i++) {
            if(maximo < numeros[i]) {
                maximo=numeros[i];
                posicion=i+1;
            }
        }
        System.out.println("El numero maximo es: " + maximo + " en la posicion " + 
        posicion);
    }    
}

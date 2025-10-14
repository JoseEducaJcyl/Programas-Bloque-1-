public class Matriz {
    public static void main(String[] args) {
        //Declaramos la array
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        /*Declaramos una variable que guarde
          el resultado del metodo sumaElementos  
        */ 
        int resultado = sumaElementos(numeros);
        //Se imprime el resultado de la suma
        System.out.println("La suma total es: " + resultado);
        //Se imprime el resultado de maximoElemento
        System.out.println("El maximo elemento es: " + maximoElemento(numeros));
        //Se imprime el resultado de minimoElemento
        System.out.println("El maximo elemento es: " + minimoElemento(numeros));
        
    }    
    //Metodo que suma los elementos del array
    public static int sumaElementos (int[] numeros) {
        int sumaTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaTotal+=numeros[i];
        }
        return sumaTotal;
    }
    //Metodo que busca el mayor elemento del Array
    public static int maximoElemento(int[] numeros) {
        int maximoNum = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(maximoNum < numeros[i]){
                maximoNum = numeros[i];
            }
        }
        return maximoNum;
    }
    //Metodo que busca el minimo elemento del Array 
    public static int minimoElemento(int[] numeros) {
        int minimoNum = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(minimoNum > numeros[i]){
                minimoNum = numeros[i];
            }
        }
        return minimoNum;
    }
}

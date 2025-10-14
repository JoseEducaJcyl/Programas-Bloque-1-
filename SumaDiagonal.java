public class SumaDiagonal {
    public static void main(String[] args) {
        //Declaramos el Array bidimensional
        int[][] numeros={{2,4,8},{3,6,9},{5,10,15}};
        //Imprimimos el Array
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
        System.out.println();    
        }
        System.out.println(" ");
        //Usamos el metodo para sumar la diagonal del Array
        System.out.println(sumaDgl(numeros));
    }
    //Metodo que calcula y suma la diagonal del Array
    public static int sumaDgl(int[][] num){
        int sumTotal = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(i == j){
                    sumTotal+= num[i][j];
                }
            }
        }
        return sumTotal;
    }
}

public class Primo {
    public static void main(String[] args) {
        int numero = 7;
        boolean bandera = true;
        for (int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                bandera = false;
                break;
            }    
        }
        if (bandera) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
}

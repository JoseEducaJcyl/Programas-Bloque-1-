public class InversoCaracterString {
    public static void main(String[] args) {
        String cadena = "Programacion";
        char c = 'c';
        char[] cadenaInversa = new char[cadena.length()];
        for (int i = cadena.length() - 1,j=0; i >= 0; i--,j++) {
            c = cadena.charAt(i);
            cadenaInversa[j] = c;
        }
        for (int i = 0; i < cadenaInversa.length; i++) {
            System.out.print(cadenaInversa[i]);
        }
    }
}

public class Palindromo {
    public static void main(String[] args) {
        String palabra = "sobreverbos";
        char c = 'c';
        StringBuilder constructor = new StringBuilder();
        char[] cadenaInversa = new char[palabra.length()];
        for (int i = palabra.length() - 1,j=0; i >= 0; i--,j++) {
            c = palabra.charAt(i);
            cadenaInversa[j] = c;
        }
        for (int i = 0; i < cadenaInversa.length; i++) {
            constructor.append(cadenaInversa[i]);
        }
        if(palabra.equals(constructor.toString())){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
}

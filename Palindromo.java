public class Palindromo {
    public static void main(String[] args) {
        //Declaramos una variable palabra
        String palabra = "sobreverbos";
        //Declaramos una varible tipo "char" para almacenar 
        //temporalmente los caracteres
        char c = 'c';
        //Declaramos un objeto StringBuilder
        StringBuilder constructor = new StringBuilder();
        //Declaramos un array con la misma longitud que la palabra
        char[] cadenaInversa = new char[palabra.length()];
        //Llenamos el array con la palabra de manera inversa usando
        //la variable char y el metodo chatAt()
        for (int i = palabra.length() - 1,j=0; i >= 0; i--,j++) {
            c = palabra.charAt(i);
            cadenaInversa[j] = c;
        }
        //Usamos el Stringbuilder para tener la palabra
        //a la inversa 
        for (int i = 0; i < cadenaInversa.length; i++) {
            constructor.append(cadenaInversa[i]);
        }
        //A traves de un if, le decimos al usuario
        //si la parabra es igual es palindromo y no 
        //si es el caso
        if(palabra.equals(constructor.toString())){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
}

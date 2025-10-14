public class Animal {
    String nombre;
    String especie;
    int edad;

    public void sonido(){
        System.out.println("Soy " + this.nombre + " de especie " + this.especie
        + " y tengo " + this.edad + " años y hago mi sonido caracteristico");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.nombre = "pepe";
        animal.especie = "Perro";
        animal.edad = 5;
        animal.sonido();
    }
}

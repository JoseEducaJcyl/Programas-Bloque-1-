public class Libro {
    String titulo;
    String autor;
    int anyoPublicacion;

    public void detalles(){
        System.out.println("El libro " + this.titulo + 
        " del autor " + this.autor + " del año " + 
        this.anyoPublicacion);
    }
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.titulo = "El Señor de los Anillos";
        libro.autor = "J. R. R. Tolkien";
        libro.anyoPublicacion = 1954;
        libro.detalles();
    }
}

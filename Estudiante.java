public class Estudiante {
    String nombre;
    int edad;
    String carrera;

    public void saludar(){
        System.out.println("Hola soy " + this.nombre + 
        " y tengo " + this.edad + " años y estudio la carrera de " + 
        this.carrera );
    } 
    public void estudiar(String asignatura){
        System.out.println(this.nombre + " estudia " + asignatura);
    } 
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Jose";
        estudiante.edad = 24;
        estudiante.carrera = "Informatica";
        estudiante.saludar();
        estudiante.estudiar("Programacion");
    }
}

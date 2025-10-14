public class Coche {
    String marca;
    String modelo; 
    int año;
    int km;
    double litros;

    public void encender(){
        System.out.println("El coche de marca " + 
        this.marca + " y modelo " + this.modelo + 
        " esta encendido");
    }
    public void apagar(){
        System.out.println("El coche de marca " + 
        this.marca + " y modelo " + this.modelo + 
        " esta apagado");
    }
    public void conducir(int x_Km) {
        double kmLitros = x_Km * 0.008;
        if(kmLitros > this.litros) {
            System.out.println("El coche de marca "+ 
            this.marca + " y modelo " + this.modelo + " le faltan litros para conducir");
        }else{
            System.out.println("El coche de marca " + 
            this.marca + " y modelo " + this.modelo + 
            " conduce " + x_Km + 
            " Km");
            this.km += x_Km;
            this.litros -= (double)x_Km;
        }
    }
    public void repostar(double x_Lt) {
        System.out.println("El coche de marca"+ this.marca + 
        "y modelo" + this.modelo + " a repostado " + x_Lt + 
        " litros");
        this.litros += x_Lt;
    }
    public void mostrar(){
        System.err.println("El coche de marca " + 
        this.marca + " modelo " + this.modelo + 
        " del año " + this.año + " con " + this.km +
        " kilometros con " + this.litros + " litros en el tanque");
    }
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "BMW";
        coche.modelo = "GTR-M3";
        coche.año = 2005;
        coche.km = 0;
        coche.litros = 99.9;
        coche.mostrar();
        coche.encender();
        coche.conducir(100);
        coche.conducir(50);
        coche.apagar();
        coche.repostar(100.0);
        coche.mostrar();
    }
}

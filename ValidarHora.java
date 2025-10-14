public class ValidarHora {
    public static void main(String[] args) {
        int hora = 24;
        int minuto = 40;
        int segundo = 20;
        esHoraValida(hora,minuto,segundo);
    }
    public static void esHoraValida(int hora, int minuto, int segundo){
        if(hora > 24 || minuto > 59 || segundo > 59){
            System.out.println("Hora no valida");
        }else{
            System.out.println("Hora: " + hora + 
            " con " + minuto + " minutos y " + segundo + 
            " segundos");
        }
    }
}

public class CuentaBancaria {
    String titular;
    int saldo;
    int numeroCuenta;

    public void depositar(int cantidadD){
        System.out.println("El titular " + this.titular +
        " ha depositado " + cantidadD + "en el numero de cuenta " +
        this.numeroCuenta);
        this.saldo += cantidadD;
    }
    public void retirar(int cantidadR){
        if(cantidadR < this.saldo){
            System.out.println("El titular " + this.titular +
            " ha retirado " + cantidadR + "en el numero de cuenta " +
            this.numeroCuenta);
            this.saldo -= cantidadR;
        }else{
            System.out.println("Fondos insuficientes");
        }
    }
    public void mostrarInfo(){
        System.out.println("El titular " + this.titular + 
        " con saldo " + this.saldo + " y numero de cuenta " + 
        this.numeroCuenta);
    }
    public static void main(String[] args) {
        
    }
}

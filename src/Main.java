public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(500000);
        cuenta.retirar(25000);
        System.out.println("Saldo: " + cuenta.getSaldo()); // debe imprimir 250000
    }
}

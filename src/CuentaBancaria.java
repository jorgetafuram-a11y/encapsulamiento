//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 250000;
    }

    public void depositar(double monto) {
        if (monto > 25000) {
            this.saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

}
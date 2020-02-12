public abstract class Contas {
    private Clientes clientes;
    private double saldo;

    public Contas(Clientes clientes, double saldo) {
        this.clientes = clientes;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("valor invalido!");
        }
    }

    public void sacar(double valor) {
        this.saldo -= valor;

    }

    public void consultaSaldo() {
        System.out.println("O seu saldo é : " + this.saldo);
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

public class Corrente extends Contas {


    public Corrente(Clientes clientes, double saldo) {
        super(clientes, saldo);
    }

    public void depositaCheque(float valor, String banco, String data) {
        if(valor > 0) {
            depositar(valor);
            System.out.println("Cheque depositado:\n" +
                    "Banco:" + banco +
                    "\nData:" + data +
                    "\nValor:" + valor +
                    "\nSaldo: " + this.getSaldo());
        }else{
            System.out.println("Valor do cheque invalido!");
        }

    }

    @Override
    public void sacar(double valor) {
        if ((super.getSaldo() - valor) > -500.0) {
            super.sacar(valor);
            System.out.println("Saldo:" + getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

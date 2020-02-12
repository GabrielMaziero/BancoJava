public class Poupanca extends Contas {


    public Poupanca(Clientes clientes, double saldo) {
        super(clientes, saldo);
    }

    public void recolherJuros() {
        double calculoJuros;

        calculoJuros = (this.getSaldo() * 0.5);
        super.setSaldo((calculoJuros + getSaldo()));
        System.out.println("Seu saldo com juros é: " + getSaldo());

    }
}
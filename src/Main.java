public class Main {
    public static void main(String[] args) {
        Clientes gabriel = new Clientes(2020, "Maziero", 444847888, 384317498);
        Poupanca contaPoupanca = new Poupanca(gabriel, 0);
        Corrente contaCorrente = new Corrente(gabriel, 0);

        contaCorrente.sacar(500);


        contaPoupanca.depositar(100);
        contaPoupanca.consultaSaldo();
        contaPoupanca.recolherJuros();
        contaCorrente.depositaCheque(100,"Santander","23/11/2019");


    }
}

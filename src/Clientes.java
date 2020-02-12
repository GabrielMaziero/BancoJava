public class Clientes {
    private int numero;
    private String sobrenome;
    private double rg;
    private int cpf;

    public Clientes(int numero, String sobrenome, double rg, int cpf) {
        this.numero = numero;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getRg() {
        return rg;
    }

    public void setRg(double rg) {
        this.rg = rg;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}

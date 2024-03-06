
public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void contaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
}

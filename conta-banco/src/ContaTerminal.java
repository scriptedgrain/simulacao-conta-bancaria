import java.util.Scanner;
public class ContaTerminal {
    private static int numero;
    private static String agencia;
    private static String nomeCliente;
    private static double saldo;

    public static void main(String[] args) throws Exception {

    //Inserção de dados pelo usuário:

        Scanner src = new Scanner(System.in);

        System.out.println("\nInforme o número de sua conta: ");
        numero = src.nextInt();
        
        System.out.println("\nInforme o número de sua agência: ");
        agencia = src.next();

        nomeCliente = "Lucca Maia";
        saldo = 50.00;

    //Impressão dos dados do usuário:

        System.out.println("Olá " 
        + nomeCliente 
        + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia
        + ", conta "
        + numero
        + " e seu saldo "
        + saldo
        + " R$ já está disponível para saque.");
    }
}

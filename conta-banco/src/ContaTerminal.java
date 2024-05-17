import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldoReal;

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        saldoReal = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoReal + " já está disponível para saque.";

        System.out.println(mensagem);
        
        scanner.close();


    }
}

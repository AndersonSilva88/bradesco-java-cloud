import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 100.00;
        //Exibir as mensagens para o nosso usuário
        System.out.println("***********************************");
        System.out.println("***** SEJA BEM VINDO DIOBANK ******");
        System.out.println("***********************************");
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Digite seu nome: ");
        nomeCliente = scan.nextLine();
        System.out.println("Digite sua agencia: ");
        agencia = scan.nextLine();
        System.out.println("Digite o numero da conta bancária: ");
        numero = scan.nextInt();
        //Exibir a mensagem conta criada
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                ", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
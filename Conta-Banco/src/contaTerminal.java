import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
        String numero ;
        String agencia;
        String nomeCliente;
        String saldo;

    
        Scanner scanner = new Scanner(System.in);


        //Exibir as mensagens para o nosso usuario

        System.out.println("por favor, digite o n�mero da Agencia:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o n�mero da conta:");
        numero = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da sua conta:");
        saldo = scanner.nextLine();



        //Exibir a mensagem conta criada
        System.out.println("Ol�" + nomeCliente + ". obrigado por criar uma conta em nosso banco, sua agencia �" + agencia + ", conta" + numero + "e seu saldo" + saldo + "j� est� disponivel para saque.");
        scanner.close();
        
        

        //Obter pela scanner os valores digitados no terminal 

    }
}

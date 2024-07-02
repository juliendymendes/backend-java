import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
			Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);
			int numero = 0;
			String agencia = "";
			String nomeCliente = "";
			double saldo = 0.0;

			System.out.println("###############################");
			System.out.println("Bem-vindo(a)! Para criar sua conta, precisamos de algumas informações.");
			System.out.println("###############################");
			System.out.print("Número da conta: ");
			numero = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Agência: ");
			agencia = scanner.nextLine();
			
			System.out.print("Nome do cliente: ");
			nomeCliente = scanner.nextLine();
			
			System.out.print("Saldo: ");
			saldo = scanner.nextDouble();
			scanner.nextLine();
			String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque", nomeCliente, agencia, numero,saldo);
			System.out.println("###############################");
			System.out.println(mensagem);
			scanner.close();
    }
}

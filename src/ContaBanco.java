import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o número da agência:");
		int agencia = Integer.valueOf(scanner.nextLine());

		System.out.println("Por favor, digite o número da conta:");
		String conta = scanner.nextLine();

		System.out.println("Por favor, digite seu nome:");
		String nome = scanner.nextLine();

		System.out.println("Por favor, digite o saldo da conta:");
		double saldo = Double.valueOf(scanner.nextLine());

		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
				+ ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
	}
}

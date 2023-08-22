import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao nosso Banco, vamos criar uma conta para você!");
        System.out.println("Primeiramente, digite seu nome");
        String nome = scanner.next();
        scanner.next();

        System.out.println("Agora informe qual será o número de sua agência");
        String agencia = scanner.next();

        System.out.println("Também nos informe o número que você deseja que seja o da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por fim, nos indique o valor do seu primeiro deposito");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "
                .concat(nome)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é "
                        .concat(agencia)
                        .concat(", conta ")
                        .concat(String.valueOf(numeroConta))
                        .concat(" e seu saldo é ")
                        .concat(String.valueOf(saldo))
                        .concat(" e já está disponível para saque")));
    }
}
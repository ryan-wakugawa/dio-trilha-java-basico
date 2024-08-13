import java.util.*;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);  

        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência!");
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo!");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Insira o segundo numero: ");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo numero deve ser maior que o primeiro!");
        }
    }

    private static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if (n2<n1) throw new ParametrosInvalidosException();
        for (int i = 1; i <= n2-n1; i++) {
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência:");
        scanner.nextLine();
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numeroConta, saldo);
        
        scanner.close();
    }
}
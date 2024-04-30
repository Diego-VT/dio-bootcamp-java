import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe numero da conta bancaria:");
        int numeroConta = ler.nextInt();

        ler.nextLine();

        System.out.println("Informe Agencia:");
        String agencia =  ler.nextLine();

        System.out.println("Informe o Nome do Cliente:");
        String nome = ler.nextLine();

        System.out.println("Informe o saldo: ");
        double saldo = ler.nextDouble();

        System.out.println("Olá " + nome + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");


        ler.close();
    }
}

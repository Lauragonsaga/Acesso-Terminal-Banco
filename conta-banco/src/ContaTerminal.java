import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal  {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome");
            final String nome = scanner.next();
                
            System.out.println("Digite seu Sobrenome");
            final String Sobrenome = scanner.next();

            System.out.println("Digite sua Conta");
            final int Conta = scanner.nextInt();
                
            System.out.println("Digite sua agencia");
                final double agencia = scanner.nextDouble();

            System.out.println("Digite sua senha");
                final String senha = scanner.next();

                
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nome + " " + Sobrenome + ", obrigado por acessar sua conta em nosso banco!");
            System.out.println("Sua conta é " + Conta + " Conta Corrente ");
            System.out.println("Sua agencia é " + agencia + "");
            System.out.println(" ");
                System.out.println("Senha " + senha + "");

            
            
                System.out.println("Seu Saldo é: ***** ");
        }
        
    }

}

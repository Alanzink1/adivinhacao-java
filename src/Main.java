import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int numeroGerado = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int chances = 5;

        System.out.println("""
                ===============================
                      JOGO DA ADIVINHAÇÃO!
                ===============================
                  Envia qualquer coisa para
                            jogar!
                """);
        scanner.next();

        System.out.printf("""
                %n
                Regras:
                    ° Será gerado um número de 1 a 100
                    ° Acerte o número!
                %n
                """);
        scanner.next();

        System.out.println("Número Gerado!");

        while (chances > 0) {
            System.out.printf("Você tem %d chances, boa sorte!%n", chances);
            System.out.println("Número: ");

            int chuteUsuario = scanner.nextInt();

            if(chuteUsuario == numeroGerado) {
                System.out.println("""
                        Uau! Você acertou!
                            Parabéns!
                        As chances eram de
                            1.00000%
                        """);
                break;
            }

            if(numeroGerado > chuteUsuario) {
                System.out.println("O número gerado é maior!");
            } else {
                System.out.println("O número gerado é menor!");
            }
            if(chances == 1) {
                System.out.println("""
                        %n
                        =================
                            GAME OVER
                        =================
                        """);
            }
            chances--;

        }

    }
}
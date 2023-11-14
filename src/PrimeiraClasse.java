import java.util.Random;
import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args){

        int numeroSecreto = new Random().nextInt(100);
        int numeroDeTentativas = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                    Bem vindo ao jogo do Número Secreto!
                    
                    O objetivo é acertar o número secreto!
                    
                    Você terá 5 tentativas, vamos começar?
                    """);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número:");
            int valor = scanner.nextInt();

            if (numeroSecreto == valor){
                System.out.println("Parabens! Você acertou o número secreto. O número era: " + numeroSecreto);
                break;
            }
            if (numeroSecreto < valor && numeroDeTentativas < 5){
                System.out.println("O número secreto é menor!");
            }else {
                System.out.println("O número secreto é maior");
            }
            i = numeroDeTentativas;
            numeroDeTentativas++;

            if(numeroDeTentativas == 5){
                System.out.println("Que pena você não acertou o número :( O número secreto era: " + numeroSecreto);
            }
        }
    }
}

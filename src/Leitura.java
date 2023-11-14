import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do filme:");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento do filme:");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite a avaliação do filme:");
        double avaliacaoDoFilme = leitura.nextDouble();

        System.out.println("Filme: " + filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nota do filme: " + avaliacaoDoFilme);
        if (avaliacaoDoFilme >= 8.5) {
            System.out.println("Avaliação excelente!");
        }if (avaliacaoDoFilme >= 7.5 && avaliacaoDoFilme < 8.5) {
            System.out.println("Avalização média!");
        }if (avaliacaoDoFilme < 7.5){
            System.out.println("Avaliação ruim!");
        }
    }
}

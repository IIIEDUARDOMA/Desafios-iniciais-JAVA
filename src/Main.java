public class Main {
    public static void main(String[] args) {

        int anoDeLancamento = 2012;
        boolean incluiNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.2)/3;
        System.out.printf("A média do filme é de: %.1f %n", media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
             
                """;
        System.out.println(sinopse);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        int classificacao = (int) (media/2);
        System.out.println("Classificacao do filme: " + classificacao);

    }
}

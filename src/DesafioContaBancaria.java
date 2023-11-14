import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        String nome = "Eduardo Martins de Almeida";
        String tipoDeConta = "Corrente";
        double saldo = 2000.00;

        System.out.printf("""
                ***********************************************
                                
                Bem vindo ao Banco Alura!!!
                                
                Nome: %s
                Tipo de conta: %s
                Saldo: R$%.2f
                                
                ***********************************************
                %n""",nome ,tipoDeConta, saldo);

        String menu = """
                
                ** Digite o menu desejado **
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;

        Scanner leitor = new Scanner(System.in);




        for (int i = 0; i < 1000; i++) {

            System.out.println(menu);
            int opcao = leitor.nextInt();
            if (opcao == 1){
                System.out.printf("O seu saldo atual é de: R$%.2f%n", saldo);
            }
            if (opcao == 2) {
                System.out.println("Informe o valor a ser recebido:");
                double valorRecebido = leitor.nextDouble();
                saldo += valorRecebido;
                System.out.printf("O seu saldo atual é de: R$%.2f%n", saldo);
            }
            if (opcao == 3){
                System.out.println("Informe o valor que deseja transferir: ");
                double valorTransferido = leitor.nextDouble();
                    if (valorTransferido > saldo){
                        System.out.println("Não há saldo suficiente para transfeência!");
                     }else {
                        saldo -= valorTransferido;
                        System.out.printf("O seu saldo atual é de: R$%.2f%n", saldo);
                    }

            }
            if (opcao == 4){
                System.out.println("O Banco Alura agradece, volte sempre!");
                break;
            }


            if (opcao > 4 || opcao < 1){
                System.out.println("Opção inválida! Por favor digite uma opção válida para prosseguir!");
            }

        }

    }

}

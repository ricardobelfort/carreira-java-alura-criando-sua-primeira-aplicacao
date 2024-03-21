import java.util.Scanner;

public class DesafioControleContaBancaria {
    public static void main(String[] args) {
        String nomeCliente = "Ricardo Belfort";
        String tipoConta = "Corrente";
        double saldoConta = 2500.0;
        int opcao = 0;

        System.out.println("****************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome cliente:     " + nomeCliente);
        System.out.println("Tipo conta:         " + tipoConta);
        System.out.println("Saldo atual:        R$ " + saldoConta);
        System.out.println("\n****************************************");

        String operacoes;
        operacoes = """
                Operações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        Scanner leitor = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("\n" + operacoes);
            System.out.println("Digite a opção desejada:");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é R$ " + saldoConta);
            } else if (opcao == 2) {
                System.out.println("\nInforme o valor a receber:");
                double valorReceber = leitor.nextInt();
                saldoConta += valorReceber;
                System.out.println("\nSaldo atualizado R$ " + saldoConta);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double valorRetirada = leitor.nextInt();

                if (valorRetirada <= saldoConta) {
                    saldoConta -= valorRetirada;
                    System.out.println("\nSaldo atualizado R$ " + saldoConta);
                } else {
                    System.out.println("\nNão há saldo suficiente para fazer essa transferência.");
                }
            } else if (opcao != 4){
                System.out.println("\nOpção inválida. Tente novamente.");
            } else {
                System.out.println("Obrigado e volte sempre!");
            }
        }
    }
}

import java.util.Scanner;

public class L03Ex15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroConta, codigoMovimentacao;
        double saldoAnterior, valorMovimentacao, saldoAtual;
        String nome, clienteMaiorSaldo = "";
        double maiorSaldo = 0, totalDinheiroEmCaixa = 0;

        System.out.println("Digite as informações das contas dos clientes (digite 0 para encerrar):");

        do {
            System.out.print("Número da conta: ");
            numeroConta = ler.nextInt();

            if (numeroConta == 0) {
                break; // Encerra o loop quando o número da conta é 0
            }

            ler.nextLine(); // Consumir a quebra de linha após a leitura do número da conta

            System.out.print("Nome do cliente: ");
            nome = ler.nextLine();

            System.out.print("Saldo anterior: R$ ");
            saldoAnterior = ler.nextDouble();

            saldoAtual = saldoAnterior;

            do {
                System.out.print("Código da movimentação (1 para crédito, 2 para débito, 3 para fim): ");
                codigoMovimentacao = ler.nextInt();

                if (codigoMovimentacao == 1 || codigoMovimentacao == 2) {
                    System.out.print("Valor da movimentação: R$ ");
                    valorMovimentacao = ler.nextDouble();

                    if (codigoMovimentacao == 1) {
                        saldoAtual += valorMovimentacao; // Crédito
                    } else {
                        saldoAtual -= valorMovimentacao; // Débito
                    }
                }

            } while (codigoMovimentacao != 3);

            System.out.println("Conta: " + numeroConta + " - Nome: " + nome + " - Saldo Atual: R$ " + saldoAtual);

            totalDinheiroEmCaixa += saldoAtual;

            if (saldoAtual > maiorSaldo) {
                maiorSaldo = saldoAtual;
                clienteMaiorSaldo = nome;
            }

        } while (true);

        System.out.println("Total de dinheiro em caixa: R$ " + totalDinheiroEmCaixa);
        System.out.println("Cliente com maior saldo: " + clienteMaiorSaldo);
    }
}

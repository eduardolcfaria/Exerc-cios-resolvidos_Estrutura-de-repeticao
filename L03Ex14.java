import java.util.Scanner;

public class L03Ex14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroCarteira, totalMultas = 0;
        double valorMulta, totalRecursos = 0;
        String nome, nomeMaiorMultas = "";
        int maiorNumeroMultas = 0;

        System.out.println("Digite as informações dos motoristas (digite 0 para encerrar):");

        do {
            System.out.print("Número da carteira: ");
            numeroCarteira = ler.nextInt();

            if (numeroCarteira == 0) {
                break; // Encerra o loop quando o número da carteira é 0
            }

            ler.nextLine(); // Consumir a quebra de linha após a leitura do número da carteira

            System.out.print("Nome do motorista: ");
            nome = ler.nextLine();

            System.out.print("Número de multas: ");
            int numeroMultas = ler.nextInt();

            if (numeroMultas > maiorNumeroMultas) {
                maiorNumeroMultas = numeroMultas;
                nomeMaiorMultas = nome;
            }

            double valorTotalMultaMotorista = 0;

            for (int i = 1; i <= numeroMultas; i++) {
                System.out.print("Valor da multa " + i + ": R$ ");
                valorMulta = ler.nextDouble();
                valorTotalMultaMotorista += valorMulta;
                totalMultas++;
            }

            System.out.println("Nome: " + nome + " - Dívida: R$ " + valorTotalMultaMotorista);
            totalRecursos += valorTotalMultaMotorista;

        } while (true);

        System.out.println("Total de recursos arrecadados: R$ " + totalRecursos);
        System.out.println("Motorista com maior número de multas: " + nomeMaiorMultas);
    }
}

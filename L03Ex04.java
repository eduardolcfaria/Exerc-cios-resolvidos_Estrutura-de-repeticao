import java.util.Scanner;

public class L03Ex04 {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);

        int qtdContribuintes = 0, qtdClientes = 0;
        double valorContaTelefonica, media = 0, menor = Double.MAX_VALUE;
        long cpfMenorConta = 0;

        for (int i = 1; i >= 0; i++) {
            System.out.print("Informe o " + (i) + " CPF ou zero para sair a qualquer momento: ");
            long numeroCPF = ler.nextLong();

            if (numeroCPF == 0) {
                System.out.print("Saindo do programa...");
                break;
            }

            System.out.print("Digite o valor da conta telefônica: ");
            valorContaTelefonica = ler.nextDouble();

            qtdContribuintes++;

            if (valorContaTelefonica < 500) {
                qtdClientes++;
            }

            media = valorContaTelefonica / qtdContribuintes;

            if (valorContaTelefonica < menor) {
                menor = valorContaTelefonica;
                cpfMenorConta = numeroCPF;
            }
        }

        ler.close();

        System.out.println("Quantidade de Contribuintes: " + qtdContribuintes);
        System.out.println("Média dos valores pagos: " + media);
        System.out.println("Quantidade de contribuintes que pagam menos que R$ 500,00: " + qtdClientes);
        System.out.println("O número CPF que pagou a menor conta: " + cpfMenorConta);

    }
}

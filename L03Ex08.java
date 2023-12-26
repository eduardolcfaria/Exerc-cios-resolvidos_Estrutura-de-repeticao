import java.util.Scanner;

public class L03Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valorDiaria = 30;
        int qtdDias, numConta = 0;
        double totalDiaria = 0.0, lucroPousada = 0.0;
        String nome = " ";
        do {
            System.out.print("Digite a quantidade de dias desejadas para estadia ou [0] para finalizar: ");
            qtdDias = ler.nextInt();
            if (qtdDias != 0) {
                System.out.print("Informe o número da conta: [5 digitos]: ");
                numConta = ler.nextInt();
                ler.nextLine();
                System.out.print("Informe o seu nome: ");
                nome = ler.nextLine();

                if (qtdDias < 10) {
                    totalDiaria = (valorDiaria * qtdDias) + 15;
                } else if (qtdDias >= 10) {
                    totalDiaria = (valorDiaria * qtdDias) + 8;
                }
                lucroPousada = lucroPousada + totalDiaria;
            }
            System.out.println("NOME: " + nome);
            System.out.println("Conta a pagar: " + totalDiaria);
            System.out.println("NÚMERO CONTA: " + numConta);
            System.out.println("LUCRO DA POUSADA: " + lucroPousada);

        } while (qtdDias != 0);
        System.out.print("PROGRAMA FINALIZADO...");
        ler.close();
    }
}

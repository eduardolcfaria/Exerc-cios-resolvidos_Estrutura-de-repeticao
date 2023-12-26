import java.util.Scanner;

public class L03Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nConta, saldo;
        String nome ="", status = "";
        int qtdPessoas = 0,pessoasSaldo100e200 = 0;
        do {
            System.out.print("Digite o número da conta ou zero para finalizar: ");
            nConta = ler.nextDouble();
            if (nConta != 0) {
                System.out.print("Digite o seu nome: ");
                nome = ler.next();
                System.out.print(nome + " Informe o seu saldo: ");
                saldo = ler.nextDouble();

                if (saldo > 500) {
                    status = "Cliente Vip";
                    System.out.println("Nome: " + nome + " Status: " + status);

                }
                if (saldo >= 100 && saldo <= 200) {
                    pessoasSaldo100e200++;
                }
                qtdPessoas++;

            }

        } while (nConta != 0);

        if (qtdPessoas > 0) {
            System.out.println("Quantidade de Pessoas com saldo entre R$ 100,00 e R$ 200,00: " + pessoasSaldo100e200);

        } else {
            System.out.println("Nenhuma conta foi informada.");
        }

        ler.close();
    }
}

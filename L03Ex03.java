import java.util.Scanner;

public class L03Ex03 {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);

        int qtdPessoas, qtdPessoasMenos18 = 0, idade;
        float peso;
        String nome;

        System.out.print("Digite a quantidade de pessoas: ");
        qtdPessoas = ler.nextInt();

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + " ou zero para finalizar o programa: ");
            idade = ler.nextInt();

            if (idade == 0) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.print("Digite o nome: ");
                nome = ler.next();
                System.out.print("Digite o peso: ");
                peso = ler.nextFloat();

                if (idade < 18) {
                    qtdPessoasMenos18++;
                }

                if (peso > 80) {
                    System.out.println(nome + " " + peso + " Obeso");
                }
            }
        }
        ler.close();

        System.out.println("Quantidade de pessoas com menos de 18 anos: " + qtdPessoasMenos18);
    }
}

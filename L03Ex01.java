import java.util.Scanner;

public class L03Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int qtdPessoas = 0, idade, totalPessoasMenos21 = 0, totalPessoas50 = 0;
        float peso = 0;
        String nome;
        double somaIdades = 0, somaPesos51 = 0, mediaIdade , mediaPeso50;

        do {
            System.out.print("Informe seu nome: ");
            nome = ler.next();
            System.out.print("Digite a idade ou 0 para finalizar o programa: ");
            idade = ler.nextInt();

            if (idade != 0) {
                System.out.print("Informe o peso: ");
                peso = ler.nextFloat();

                if (idade < 21) {
                    totalPessoasMenos21++;
                }
                if (idade >= 51) {
                    totalPessoas50++;
                    somaPesos51 += peso;
                }

                qtdPessoas++;
                somaIdades += idade;
            }

        } while (idade != 0);

        mediaIdade = somaIdades / qtdPessoas;
        mediaPeso50 = somaPesos51 / totalPessoas50;

        if (qtdPessoas > 0) {
            System.out.println("Saindo do programa.");
            System.out.println("Total de pessoas com menos de 21 anos: " + totalPessoasMenos21);
            System.out.println("Média das idades: " + mediaIdade);
            System.out.println("Peso médio das pessoas com mais de 50 anos: " + mediaPeso50);
        } else {
            System.out.println("Nenhuma pessoa foi informada.");
        }

        ler.close();
    }
}

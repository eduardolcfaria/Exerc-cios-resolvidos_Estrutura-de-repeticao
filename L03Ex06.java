import java.util.Scanner;

public class L03Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade, contMulheres = 0, contHomens = 0, qtdPessoas = 0, somaIdade = 0;
        char sexo;
        float altura;
        double mediaIdade, mediaAlturaHomens, somaAlturaHomens = 0.0;

        do {
            System.out.print("Informe a [" + qtdPessoas + "] idade ou [0] para sair: ");
            idade = ler.nextInt();

            if (idade != 0) {
                System.out.print("Informe o sexo (F) Feminino ou (M) Masculino: ");
                sexo = ler.next().charAt(0);
                System.out.print("Informe a sua altura: ");
                altura = ler.nextFloat();

                if (sexo == 'f' && idade >= 30 && idade <= 45) {
                    contMulheres++;
                }

                if (sexo == 'm') {
                    contHomens++;
                    somaAlturaHomens += altura;
                }

                somaIdade += idade;
                qtdPessoas++;
            }

        } while (idade != 0);

        mediaIdade = (double) somaIdade / qtdPessoas;
        if (contHomens > 0) {
            mediaAlturaHomens = somaAlturaHomens / contHomens;
        } else {
            mediaAlturaHomens = 0;
        }

        System.out.println("IDADE MÉDIA: " + mediaIdade);
        System.out.println("Total de mulheres com idade entre 30 e 45 anos: " + contMulheres);
        System.out.println("Média da Altura dos Homens: " + mediaAlturaHomens);
        ler.close();
    }
}

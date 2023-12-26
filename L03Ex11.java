import java.util.Scanner;

public class L03Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int qtdAluno = 0, qtdAlunos200 = 0, qtdAlunosMaior = 0;
        double rendaPessoal, rendaFamiliar, totalGastoAliment, totalGastoDespesas, soma = 0, porcentAlunos200, porcentGastos;
        String nome;
        do {
            System.out.print("Informe a renda pessoal do aluno ou digite [0] para finalizar [" + qtdAluno + "]: ");
            rendaPessoal = ler.nextDouble();
            if (rendaPessoal != 0) {
                System.out.print("Informe o nome do aluno [" + qtdAluno + "]: ");
                nome = ler.nextLine();
                ler.nextLine();
                System.out.print("Informe a renda familiar do aluno [" + qtdAluno + "]: ");
                rendaFamiliar = ler.nextDouble();
                System.out.print("Informe o total gasto com alimentação do aluno [" + qtdAluno + "]: ");
                totalGastoAliment = ler.nextDouble();
                System.out.print("Informe o total gasto com outras despesas do aluno [" + qtdAluno + "]: ");
                totalGastoDespesas = ler.nextDouble();

                soma = soma + totalGastoAliment + totalGastoDespesas;

                if (totalGastoDespesas > 200) {
                    qtdAlunos200++;
                }
                if (rendaPessoal > rendaFamiliar) {
                    qtdAlunosMaior++;
                }
                qtdAluno++;
            }

        } while (rendaPessoal != 0);
        porcentAlunos200 = (qtdAlunos200 * 100) / (qtdAluno * rendaPessoal);
        porcentGastos = (soma * 100) /qtdAluno ;
        System.out.println("Número de alunos com renda pessoal maior que a renda familiar: " + qtdAlunosMaior);
        System.out.println("Porcentagem de alunos que gastam mais de R$ 200 com outras despesas: " + porcentAlunos200);
        System.out.println("Porcentagem de gastos em relação a renda pessoal: " + porcentGastos);

        ler.close();
    }
}

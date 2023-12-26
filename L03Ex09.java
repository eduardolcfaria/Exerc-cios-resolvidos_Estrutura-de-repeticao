import java.util.Scanner;

public class L03Ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdTurmas, qtdAlunos, alunosAprovados = 0;
        double nota, somaNota = 0, mediaGeral = 0, mediaTurma, mediaGeralFinal;

        System.out.print("Informe a quantidade de turmas: ");
        qtdTurmas = ler.nextInt();

        for (int i = 1; i <= qtdTurmas; i++) {
            System.out.print("Informe a quantidade de alunos na Turma [" + i + "]: ");
            qtdAlunos = ler.nextInt();
            for (int j = 1; j <= qtdAlunos; j++) {
                System.out.print("Digite a nota do aluno [" + j + "]: ");
                nota = ler.nextDouble();
                somaNota = somaNota + nota;

                if (nota >= 6) {
                    alunosAprovados++;
                }
            }
            mediaTurma = somaNota / qtdAlunos;
            mediaGeral = mediaGeral + mediaTurma;

            System.out.println("Turma " + i + ":");
            System.out.println("Alunos aprovados: " + alunosAprovados);
            System.out.println("Média da turma: " + mediaTurma);
            System.out.println();
            alunosAprovados = 0;
        }

        mediaGeralFinal = mediaGeral / qtdTurmas;
        System.out.println("Média geral de todas as turmas: " + mediaGeralFinal);

        ler.close();

    }
}

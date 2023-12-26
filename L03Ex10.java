import java.util.Scanner;

public class L03Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdAlunos;
        String nomeAluno;
        double nota = 0, somaNota, mediaGeral;
        StringBuilder alunosAprovados14 = new StringBuilder();
        StringBuilder alunosAprovadosGeral = new StringBuilder();
        System.out.print("Digite a quantidade de alunos: ");
        qtdAlunos = ler.nextInt();
        ler.nextLine(); 

        for (int i = 1; i <= qtdAlunos; i++) {
            System.out.print("Digite o seu nome [" + i + "]: ");
            nomeAluno = ler.nextLine();
            somaNota = 0; 
            for (int materia = 1; materia <= 5; materia++) {
                System.out.print("Informe a nota da matéria[" + materia + "]: ");
                nota = ler.nextDouble();
                somaNota += nota;
            }

            mediaGeral = somaNota / 5;

            if (mediaGeral >= 5) {
                alunosAprovadosGeral.append(nomeAluno).append("\n");
            }
            if (mediaGeral >= 5 && (somaNota - nota >= 5 && somaNota - nota >= 5)) {
                alunosAprovados14.append(nomeAluno).append("\n");
            }
            ler.nextLine();

            System.out.println("ALUNOS APROVADOS APENAS NAS MATÉRIAS 1 E 4:\n" + alunosAprovados14);
            System.out.println("ALUNOS APROVADOS EM TODAS AS MATÉRIAS:\n" + alunosAprovadosGeral);

        }
        ler.close();
    }
}

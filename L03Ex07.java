import java.util.Scanner;

public class L03Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a massa inicial do material em gramas (digite um valor negativo para encerrar):");
        double massa = scanner.nextDouble();

        int tempo = 0; // Inicializa o tempo em segundos

        while (massa >= 0.10) {
            massa *= 0.75; // Perda de 25% da massa a cada 30 segundos
            tempo += 30; // Incrementa o tempo em 30 segundos

            if (massa < 0.10) {
                System.out.println("A massa tornou-se menor que 0,10 gramas.");
                System.out.println("Tempo necessário: " + tempo + " segundos.");
                break;
            }

            System.out.println("Massa atual: " + massa + " gramas");
            System.out.println("Tempo passado: " + tempo + " segundos");

            System.out.println("Informe a massa atual do material em gramas (digite um valor negativo para encerrar):");
            massa = scanner.nextDouble();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

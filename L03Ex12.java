import java.util.Scanner;

public class L03Ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor, menorMaiorQue100 = Integer.MAX_VALUE, somaValores50a100 = 0, somaMultiplosDe3 = 0;
        int qtdValores = 0, somaTotal = 0;

        System.out.println("Digite um conjunto de valores inteiros positivos (termine com -1):");

        while (true) {
            valor = ler.nextInt();

            if (valor == -1) {
                break; 
            }

            if (valor > 100 && valor < 1000 && valor < menorMaiorQue100) {
                menorMaiorQue100 = valor;
            }

            if (valor > 50 && valor < 100) {
                somaValores50a100 += valor;
            }

            if (valor % 3 == 0) {
                somaMultiplosDe3 += valor;
            }

            somaTotal += valor;
            qtdValores++;
        }

        if (qtdValores > 0) {
            double mediaTotal = (double) somaTotal / qtdValores;

            System.out.println("Menor valor maior que 100 e menor que 1000: "); 
            if (menorMaiorQue100 !=Integer.MAX_VALUE) {
                System.out.println(menorMaiorQue100);
            } else {
                System.out.println("N/A");
            }  
            System.out.println("Média de todos os valores: " + mediaTotal);
            System.out.println("Soma dos valores maiores que 50 e menores que 100: " + somaValores50a100);
            System.out.println("Soma dos valores múltiplos de 3: " + somaMultiplosDe3);
        } else {
            System.out.println("Nenhum valor foi digitado.");
        }

        ler.close();
    }
}

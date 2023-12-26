import java.util.Scanner;

public class L03Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int codigo, qtdPedido, vendas = 0;
        double preco = 0, soma = 0;

        System.out.println("********************X-DOGAO************************");
        System.out.println("Escolha o seu lanche digitando o código do lanche.");

        do {
            System.out.println("Código 1: X-TUDO - R$ 10\nCódigo 2: X-MALUCO - R$ 15\nCódigo 3: X-FOME - R$ 20\nCódigo[0] para sair.");
            codigo = ler.nextInt();

            if (codigo != 0) {
                System.out.print("Informe a quantidade de pedido do lanche: ");
                qtdPedido = ler.nextInt();

                if (codigo == 1) {
                    preco = 10 * qtdPedido;
                } else if (codigo == 2) {
                    preco = 15 * qtdPedido;
                    
                } else if (codigo == 3) {
                    preco = 20 * qtdPedido;
                }

                soma += preco;
                vendas += qtdPedido;
            }

        } while (codigo != 0);

        System.out.println("Quantidade de vendas: " + vendas);
        System.out.println("Total do valor: R$ " + soma);

        ler.close();
    }
}

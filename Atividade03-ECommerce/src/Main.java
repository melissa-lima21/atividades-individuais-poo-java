import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        System.out.println("\n*************** LIFE SUPPLEMENTOS *************** \n    FRETE GRÁTIS PARA COMPRAS ACIMA DE R$250");
        System.out.println("\n                DADOS CLIENTE ");

        System.out.print("NOME: ");
        String nome = leia.nextLine();
        System.out.print("CPF: ");
        String cpf = leia.nextLine();
        System.out.print("CEL: ");
        String cel = leia.nextLine();

        Cliente cliente = new Cliente(nome, cpf, cel);
        Pedido pedido = new Pedido(cliente);

        int opcao;
        do {
            System.out.print(" \n************* SUPLEMENTOS *************");

            System.out.println("\nID  PRODUTO                  VALOR");
            System.out.println("1.  Whey Protein             R$ 150,00");
            System.out.println("2.  CX Barra de Proteína     R$ 45,00");
            System.out.println("3.  Creatina                 R$ 90,00");

            System.out.println("\nEscolha o seu item digitando o número do ID (1-3): ");
            int nomeItem = leia.nextInt();

            System.out.print("Quantidade: ");
            int qtd = leia.nextInt();

            String nomeProduto = "";
            double precoProduto = 0;
            switch (nomeItem) {
                case 1:
                    nomeProduto = "Whey Protein"; precoProduto = 130.00;
                    break;
                case 2:
                    nomeProduto = "CX Barra de Proteína"; precoProduto = 45.00;
                    break;
                case 3:
                    nomeProduto = "Creatina";
                    precoProduto = 90.00;
                    break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;

            }
            if (precoProduto > 0) {
                pedido.incluirItem(new ItemPedido(nomeProduto, precoProduto, qtd));
            }
            System.out.print("\nDeseja incluir outro item? ");
            System.out.print("\nDigite '1' para 'SIM' \n Digite '2' para 'NÃO':\n");
            opcao = leia.nextInt();
            leia.nextLine();
        }
        while
        (opcao == 1);
        pedido.fecharPedido();
    }
}
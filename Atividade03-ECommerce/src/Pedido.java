import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    public void incluirItem(ItemPedido item) {
        itens.add(item);
    }
    public void fecharPedido() {
        double totalItens = 0;

        System.out.println("\n=========== RECIBO LIFE SUPLEMENTOS ===========");
        System.out.println("\nCLIENTE: "+ cliente.getNome());
        System.out.println("CPF: "+ cliente.getCpf());
        System.out.println("CEL: "+ cliente.getCel());
        System.out.println("\n-----------------------------------");
        System.out.println("\n       DESCRIÇÃO DO PEDIDO");

        for (ItemPedido i : itens) {
            System.out.printf("%d X %s  -  Valor Unitário R$ %.2f  -  Valor Total R$ %.2f%n \n", i.getQuantidade(), i.getnomeItem(), i.getPreco(), i.getSubtotal());
                    totalItens += i.getSubtotal();
        }
                double frete = (totalItens > 250.00) ? 0.0 : 25.00;
        System.out.println("-----------------------------------");
        System.out.printf("\nSUBTOTAL: R$ %.2f%n", totalItens);
        System.out.printf("FRETE: "+ (frete == 0 ? "GRÁTIS" : "R$ 25,00"));
        System.out.printf("\nVALOR TOTAL: R$ %.2f%n", (totalItens + frete));
        System.out.println("\n-----------------------------------\n");
    }
}



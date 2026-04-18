public class ItemPedido {
    private String nomeItem;
    private Double preco;
    private int quantidade;


    public ItemPedido(String nomeItem, Double preco, int qtd){
        this.nomeItem = nomeItem;
        this.preco = preco;
        this.quantidade = qtd;
    }

    public double getSubtotal() {
        return preco * quantidade;
    }
    public String getnomeItem() {
        return nomeItem;
    }
    public Double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
}


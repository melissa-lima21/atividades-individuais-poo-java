public class Cliente {
    private String nome;
    private String cpf;
    private String cel;

    public Cliente(String nome, String cpf, String cel) {
        this.nome = nome;
        this.cpf = cpf;
        this.cel = cel;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public String getCel() {
        return cel;
    }
}


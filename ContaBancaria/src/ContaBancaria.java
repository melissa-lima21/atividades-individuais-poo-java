public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private int quantidadedeSaque;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.quantidadedeSaque = 0;
        this. saldo = 50.00;
    }

    public void deposito (double valorDeposito){
        if (valorDeposito > 0 ) {
            this.saldo = this.saldo + valorDeposito;
    System.out.printf("\nDeposito de R$ %.2f adicionado!\n" , valorDeposito);
        }
        else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void saque (double valorSaque) {
        if (this.quantidadedeSaque >= 3) {
            System.out.println("\nVocê atingiu o limite máximo para saques diário!");
        } else if (valorSaque > 1000.00) {
            System.out.println("\nSó é permitido saque de até R$ 1000.00\n");
        } else if (valorSaque > this.saldo) {
        System.out.printf("\nSaldo insuficiente! Seu saldo atual é de R$ %.2f\n", this.saldo);
        }
        else if (valorSaque <= 0) {
            System.out.println("\nValor inválido!\n");
        }
        else {
            this.saldo = this.saldo - valorSaque;
            this.quantidadedeSaque++;
            System.out.printf("\nSaque de R$ %.2f realizado!\n", valorSaque);
        }
    }
    public double getSaldo(){
        return this.saldo;
    }
    public String getTitular(){
        return this.titular;
    }
}

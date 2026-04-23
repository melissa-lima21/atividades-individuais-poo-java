package entidades;
import interfaces.Fretavel;
import interfaces.Tributavel;

public abstract sealed class Veiculo  implements Fretavel, Tributavel permits Caminhao, CarrodePasseio {

    public final String placa;
    public final String marca;
    protected double valorLocacaoDiaria;
    public final int anoFabricacao;
    protected double precoFipe;

    public Veiculo( String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe) {

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;

        if (valorLocacaoDiaria <= 0 || precoFipe <= 0) {
            throw new RuntimeException("ERRO! Valor inválido!");
        }
        if (anoFabricacao < 2000 || anoFabricacao > 2026) {
            throw new RuntimeException("DATA INVÁLIDA!");
        }
        if (marca == null || marca.isEmpty()) {
            throw new RuntimeException("MARCA INVÁLIDA.");
        }
        if (placa == null || placa.isEmpty()) {
            throw new RuntimeException("Placa não identificada!");
        }
    }

    public abstract double alugarVeiculo(double pesoCarga, int dias);

    public abstract double calcularIpva();
}

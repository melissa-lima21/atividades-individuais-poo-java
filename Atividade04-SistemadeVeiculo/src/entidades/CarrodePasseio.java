package entidades;

public final class CarrodePasseio extends Veiculo {

    public CarrodePasseio( String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe){
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (dias <= 0) throw new RuntimeException("ERRO. A quantidade de dias precisa ser positiva!");
        return this.valorLocacaoDiaria * dias;
    }

    @Override
    public double calcularIpva() {
        int idade = 2026 - this.anoFabricacao;
        if (idade > 20) {
            return 0.0;
        }
           else{
               return this.precoFipe * 0.04;

        }

    }
}
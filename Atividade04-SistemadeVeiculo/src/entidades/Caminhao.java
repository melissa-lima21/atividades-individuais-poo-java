package entidades;

public final class Caminhao extends Veiculo {

    final double capacidadedeCargaToneladas;

    public Caminhao(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe, double capacidadedeCargaToneladas) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);

        this.capacidadedeCargaToneladas = capacidadedeCargaToneladas;

        if (capacidadedeCargaToneladas <= 0) {
            throw new RuntimeException("Capacidade de carga inválida!");
        }
    }
        @Override
        public double alugarVeiculo (double pesoCarga, int dias){
            if (dias <= 0) {
                throw new RuntimeException("Dias inválidos para locação!");
            }

                if (pesoCarga < 0) {
                    throw new RuntimeException("Peso da carga não pode ser negativo!");
                }

                double valorTotal = this.valorLocacaoDiaria * dias;
                double capacidadeKg = this.capacidadedeCargaToneladas * 1000;

                if (pesoCarga > capacidadeKg) {
                    valorTotal *= 1.10;
                }
                return valorTotal;
            }

    @Override
    public double calcularIpva() {
        int idade = 2026 - this.anoFabricacao;
        if (idade > 20) {
            return 0.0;
        }
        return this.precoFipe * 0.015;
    }
 }


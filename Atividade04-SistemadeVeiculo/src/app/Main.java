package app;

import entidades.Caminhao;
import entidades.CarrodePasseio;

public class Main {
    public static void main(String[] args) {
        try {

            CarrodePasseio carNovo = new CarrodePasseio("AFD 0123", "HONDA CIVIC", 450.00, 2025, 230000.0);
            System.out.println("\nCARRO MODELO NOVO");
            System.out.println("\nVeículo: " + carNovo.marca + "\nPlaca: " + carNovo.placa + "\nAno: " + carNovo.anoFabricacao);
            System.out.println("Valor do aluguel (3 dias): R$ " + carNovo.alugarVeiculo(0, 3));

            double ipvaCarNovo = carNovo.calcularIpva();
            if (ipvaCarNovo > 0) {
                System.out.println("IPVA calculado (4%): R$ " + ipvaCarNovo + "\n*******************************************\n");
            }

            Caminhao caminhao = new Caminhao("BAO 789", " Iveco", 2021, 600.00, 270000.0, 6);
            System.out.println("CAMINHÃO C/ SOBRECARGA\n");
            System.out.println("Veículo: " + caminhao.marca + "\nPlaca: " + caminhao.placa + "\nAno: " + caminhao.anoFabricacao);
            double valorLocacaoDiaria = caminhao.alugarVeiculo(12000.0, 2);
            System.out.println("Valor do aluguel (2 dias c/ sobrecarga): R$" + valorLocacaoDiaria);
            System.out.println("IPVA calculado (1.5%): R$" + caminhao.calcularIpva());

            System.out.println("\n*******************************************\n");

            Caminhao caminhaoLimite = new Caminhao("QAP 654", " Volvo", 2022, 800.00, 350000.0, 10.0);
            double aluguelSemMulta = caminhaoLimite.alugarVeiculo(10000.0, 5);
            System.out.println("CAMINHÃO S/ SOBRECARGA\n");
            System.out.println("Veículo:" + caminhaoLimite.marca + "\nPlaca: " + caminhaoLimite.placa+ "\nAno: "+ caminhaoLimite.anoFabricacao + "\nCarga: 10t");
            System.out.println("Valor do aluguel (sem sobrecarga): R$ " + aluguelSemMulta);
            System.out.println("\n*******************************************\n");

            CarrodePasseio carAntigo = new CarrodePasseio("MQL 2123", "Chevrolet Corsa", 450.00, 2004, 15000.0);
            System.out.println("CARRO MODELO ANTIGO\n");
            System.out.println("Veículo: " + carAntigo.marca + "\nPlaca: " + carAntigo.placa + "\nAno: " + carAntigo.anoFabricacao);
            double ipvaCarAntigo = carAntigo.calcularIpva();
            System.out.println("Valor IPVA: " + (ipvaCarAntigo == 0 ? "ISENTO" : ipvaCarAntigo));

            System.out.println("\n*******************************************\n");

            System.out.println("Criado veículo com valor inválido para testar erros:");
            CarrodePasseio mostrarErro = new CarrodePasseio("KTP 001", "Toyota", -20.0, 2023, 4000.0);

        } catch (RuntimeException e) {
            System.out.println(" \n ***ERRO DE INFORMAÇÕES***\n" + e.getMessage());
        }


    }
}



import java.util.Scanner;

public class Main{
    public static void main(String[] arg) {
        double saldo = 0.0;
        double valorMxdeSaque = 1000.00;
        int limitedeSaque = 3;
        int quantidadedeSaque = 0;
        int opcaoEscolhida;

        System.out.println("\n********** CAIXA ELETRÔNICO **********");

        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\n************************\n[1] Saldo  [2] Depósito \n[3] Saque  [0] Sair");
            System.out.print("\nEscolha uma opção: ");
            opcaoEscolhida = leia.nextInt();

            if (opcaoEscolhida < 0 || opcaoEscolhida > 3){
                System.out.println("\nOpção inválida! Tente novamente.");
            }
            else  if (opcaoEscolhida == 0) {
                System.out.println("\nSistema encerrado!");
            }
            else {
                switch (opcaoEscolhida) {
                    case 1:
                        System.out.printf("\nSeu saldo atual é de: R$ %.2f%n", saldo);
                        break;

                    case 2:
                        System.out.printf("\nDigite um valor para depositar: ");
                        double valorDeposito = leia.nextDouble();
                        if (valorDeposito > 0) {
                            saldo = saldo + valorDeposito;
                            System.out.printf("\nDeposito de R$ %.2f adicionado!\n" , valorDeposito);
                        }
                        else {
                            System.out.println("Valor inválido para depósito!");
                        }
                        break;

                    case 3:
                        if (quantidadedeSaque >= limitedeSaque) {
                            System.out.println("\nVocê atingiu o limite máximo para saques diário!");
                        }
                        else {
                            System.out.println("\nDigite um valor para saque: ");
                            double valorSaque = leia.nextDouble();

                            if (valorSaque > valorMxdeSaque) {
                                System.out.println("\nSó é permitido saque até R$ 1000.00\n");
                            }
                            else if (valorSaque > saldo) {
                                System.out.printf("\nSaldo insuficiente! Seu saldo atual é de R$ %.2f\n" , saldo);
                            }
                            else if (valorSaque <=0) {
                                System.out.println("\nValor inválido!\n");
                            }
                            else {
                                saldo = saldo - valorSaque;
                                quantidadedeSaque++;
                                System.out.printf("\nSaque de R$ %.2f realizado!\n", valorSaque);
                            } break;
                        }
                }

            }
        } while (opcaoEscolhida != 0);

    }
}
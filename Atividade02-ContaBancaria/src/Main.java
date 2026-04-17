import java.util.Scanner;

public class Main{
    public static void main(String[] arg) {

        int opcaoEscolhida;

        System.out.println("\n********** FAÇA A SUA CONTA E GANHE BÔNUS DE BOAS-VINDAS **********");

        Scanner leia = new Scanner(System.in);

        System.out.print("\nDigite o número da sua conta: ");
        int num = leia.nextInt();
        leia.nextLine();

        System.out.print("\nDigite o nome do titular: ");
        String nome = leia.nextLine();

        ContaBancaria contaTitular = new ContaBancaria(num, nome);

        System.out.println("\nParabéns! Você ganhou R$ 50,00 de bônus ao abrir a sua conta.");

        do {
            System.out.println("\n********** CAIXA ELETRÔNICO **********");
            System.out.println("\n[1] Saldo  [2] Depósito \n[3] Saque  [0] Sair");
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
                        System.out.printf("\nSeu saldo atual é de: R$ %.2f%n", contaTitular.getSaldo());
                        break;

                    case 2:
                        System.out.printf("\nDigite um valor para depositar: ");
                        double valorDeposito = leia.nextDouble();
                        contaTitular.deposito(valorDeposito);
                        break;

                    case 3:
                        System.out.println("\nDigite um valor para saque: ");
                        double valorSaque = leia.nextDouble();
                        contaTitular.saque(valorSaque);
                        break;

                   }
                }

            }while (opcaoEscolhida != 0);
        }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        double valor;
        String opcaoRepetir;

        do {
            System.out.println("=== Sistema Bancário ===");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar uma nova conta");
            System.out.println("2 - Acessar sua conta");
            System.out.println("3 - Encerrar o sistema");
            int opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1: {
                    System.out.println("== Criar uma nova conta ==");
                    System.out.println("Digite o tipo de conta que deseja criar:");
                    System.out.println("1 - Conta Corrente | 2 - Conta Poupança");
                    int tipoConta = scanner.nextInt();
                    switch (tipoConta) {
                        case 1:
                            System.out.println("== Criando Conta Corrente ==");
                            System.out.println("Digite o nome do titular:");
                            contaCorrente.setNome(scanner.next());
                            break;
                        case 2:
                            System.out.println("== Criando Conta Poupança ==");
                            System.out.println("Digite o nome do titular:");
                            contaPoupanca.setNome(scanner.next());
                            break;
                    }
                    break;
                }
                case 2: {
                    System.out.println("=== Acessar Conta ===");
                    System.out.println("Escolha o tipo de conta para acessar:");
                    System.out.println("1 - Conta Corrente | 2 - Conta Poupança");
                    int tipoContaAcessar = scanner.nextInt();

                    switch (tipoContaAcessar) {
                        case 1:
                            do {
                                System.out.println("== Conta Corrente ==");
                                System.out.println("Escolha uma operação:");
                                System.out.println("1 - Depositar | 2 - Sacar | 3 - Usar Cheque Especial | 4 - Mostrar informações | 5 - Voltar ao menu principal");
                                int opcaoCorrente = scanner.nextInt();

                                switch (opcaoCorrente) {
                                    case 1:
                                        System.out.println("== Depósito ==");
                                        System.out.println("Informe o valor a ser depositado:");
                                        valor = scanner.nextDouble();
                                        contaCorrente.deposito(valor);
                                        break;
                                    case 2:
                                        System.out.println("== Saque ==");
                                        System.out.println("Informe o valor a ser sacado:");
                                        valor = scanner.nextDouble();
                                        contaCorrente.saque(valor);
                                        break;
                                    case 3:
                                        System.out.println("== Cheque Especial ==");
                                        System.out.println("Informe o valor do cheque especial a ser utilizado:");
                                        valor = scanner.nextDouble();
                                        contaCorrente.limiteEspecial(valor);
                                        break;
                                    case 4:
                                        System.out.println("== Informações da Conta Corrente ==");
                                        contaCorrente.exibirInformacoes();
                                        break;
                                    case 5:
                                        System.out.println("Voltando ao menu principal...");
                                        break;
                                }
                                if (opcaoCorrente == 5) {
                                    break;
                                }
                                System.out.println("Deseja realizar outra operação na CONTA CORRENTE? Digite 's' para continuar ou qualquer outra tecla para voltar ao menu principal:");
                                opcaoRepetir = scanner.next();
                            } while (opcaoRepetir.equalsIgnoreCase("s"));
                            break;
                        case 2:
                            do {
                                System.out.println("== Conta Poupança ==");
                                System.out.println("Escolha uma operação:");
                                System.out.println("1 - Depositar | 2 - Sacar | 3 - Calcular Rendimento | 4 - Mostrar informações | 5 - Voltar ao menu principal");
                                int opcaoPoupanca = scanner.nextInt();

                                switch (opcaoPoupanca) {
                                    case 1:
                                        System.out.println("== Depósito ==");
                                        System.out.println("Informe o valor a ser depositado:");
                                        valor = scanner.nextDouble();
                                        contaPoupanca.deposito(valor);
                                        break;
                                    case 2:
                                        System.out.println("== Saque ==");
                                        System.out.println("Informe o valor a ser sacado:");
                                        valor = scanner.nextDouble();
                                        contaPoupanca.saque(valor);
                                        break;
                                    case 3:
                                        System.out.println("== Calcular Rendimento ==");
                                        System.out.println("Informe a taxa Selic atual:");
                                        double selic = scanner.nextDouble();
                                        System.out.println("Informe o número de meses para o cálculo:");
                                        int meses = scanner.nextInt();
                                        contaPoupanca.calcularRendimento(selic, meses);
                                        break;
                                    case 4:
                                        System.out.println("== Informações da Conta Poupança ==");
                                        contaPoupanca.exibirInformacoes();
                                        break;
                                    case 5:
                                        System.out.println("Voltando ao menu principal...");
                                        break;
                                }
                                if (opcaoPoupanca == 5) {
                                    break;
                                }
                                System.out.println("Deseja realizar outra operação na CONTA POUPANÇA? Digite 's' para continuar ou qualquer outra tecla para voltar ao menu principal:");
                                opcaoRepetir = scanner.next();
                            } while (opcaoRepetir.equalsIgnoreCase("s"));
                            break;
                    }
                    break;
                }
                case 3:
                    System.out.println("Encerrando o sistema...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println("Deseja continuar no sistema? Digite 's' para continuar ou qualquer outra tecla para sair:");
            opcaoRepetir = scanner.next();
        } while (opcaoRepetir.equalsIgnoreCase("s"));

        System.out.println("Sistema finalizado.");
    }
}


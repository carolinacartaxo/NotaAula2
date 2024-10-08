public class ContaPoupanca {
    private String titularConta;
    private double saldoPoupanca;

    public void setNome(String nome) {
        this.titularConta = nome;
    }

    public void deposito(double valorDeposito) {
        saldoPoupanca += valorDeposito;
        System.out.println("Depósito efetuado. Saldo atual: " + saldoPoupanca);
    }

    public void saque(double valorSaque) {
        if (saldoPoupanca >= valorSaque) {
            saldoPoupanca -= valorSaque;
            System.out.println("Saque realizado. Saldo atual: " + saldoPoupanca);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void calcularRendimento(double selic, int meses) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldoPoupanca;
        } else {
            rendimento = 0.007 * selic * saldoPoupanca;
        }
        saldoPoupanca += rendimento * meses;
        System.out.println("Rendimento calculado para " + meses + " meses. Novo saldo: " + saldoPoupanca);
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titularConta);
        System.out.println("Saldo: " + saldoPoupanca);
    }
}




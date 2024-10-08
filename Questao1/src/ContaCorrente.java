public class ContaCorrente {
    private String nomeTitular;
    private double saldoConta;

    public void setNome(String nome) {
        this.nomeTitular = nome;
    }

    public void deposito(double valorDeposito) {
        saldoConta += valorDeposito;
        System.out.println("Depósito realizado. Saldo atual: " + saldoConta);
    }

    public void saque(double valorSaque) {
        if (saldoConta >= valorSaque) {
            saldoConta -= valorSaque;
            System.out.println("Saque realizado. Saldo atual: " + saldoConta);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void limiteEspecial(double valorChequeEspecial) {
        if (saldoConta - valorChequeEspecial >= -1000) {
            saldoConta -= valorChequeEspecial;
            System.out.println("Cheque especial utilizado. Saldo atual: " + saldoConta);
        } else {
            System.out.println("Limite do cheque especial excedido.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldoConta);
    }
}


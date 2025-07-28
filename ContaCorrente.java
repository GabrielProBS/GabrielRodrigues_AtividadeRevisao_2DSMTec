public class ContaCorrente implements Conta {
    private double saldo;
    private double taxaOp = 0.45;

    @Override
    public void depositar(double valor) {
        this.saldo += valor - taxaOp; //Operação de depósito com o desconto da taxa
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor + taxaOp; //Operação de saque com o desconto da taxa
    }

    @Override
    public double getSaldo() {
        return this.saldo; //Retorna o saldo atual da conta CORRENTE
    }

    @Override
    public String toString() {
        return "Conta corrente - Saldo: " + this.getSaldo();
    }

}

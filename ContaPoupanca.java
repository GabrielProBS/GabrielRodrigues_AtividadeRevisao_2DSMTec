public class ContaPoupanca implements Conta {
    private double Saldo;
    // A taxa não existe em contas poupança

    @Override
    public void depositar(double valor) {
        this.Saldo += valor; // Operação de depósito sem taxa, pois é uma conta poupança
    }

    @Override
    public void sacar(double valor) {
        this.Saldo -= valor; // Operação de saque sem taxa, pois é uma conta poupança
    }

    @Override
    public double getSaldo() {
        return this.Saldo; // Retorna o saldo atual da conta POUPANÇA
    }

}

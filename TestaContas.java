public class TestaContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(200.00);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(1500.00);
        cp.sacar(300.00);

        GeradorExtratos gerador = new GeradorExtratos();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }
}

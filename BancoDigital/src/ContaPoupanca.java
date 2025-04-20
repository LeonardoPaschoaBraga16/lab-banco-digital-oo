public class ContaPoupanca extends Conta{

    public ContaPoupanca(Integer numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    public void Extrato(){
        super.imprimirExtrato();
        System.out.println("Conta de Tipo Poupanca");
    }

    @Override
    public Double sacar(Double valor) {
        if (valor <= 100){
            double saldo = getSaldo();
            saldo -= valor;
            System.out.println("O valor sacado foi de: R$" + valor);
            System.out.print("O valor restante é de: R$");
            return saldo;
        }
        return 0.0;
    }
}

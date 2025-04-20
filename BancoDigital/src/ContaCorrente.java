public class ContaCorrente extends Conta{

    public ContaCorrente(Integer numeroConta, Cliente cliente) { super(numeroConta, cliente); }

    public void Extrato(){
        super.imprimirExtrato();
        System.out.println("Conta de Tipo Corrente");
    }
}

    public abstract class Conta implements InterfaceConta{
    private Double saldo = 0.0;
    private Integer numeroConta;
    final int agencia = 1;
    private Cliente cliente;

        public Conta(Integer numeroConta, Cliente cliente) {
            this.numeroConta = numeroConta;
            this.cliente = cliente;
        }

        public Double getSaldo() {
            return saldo;
        }

        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }

        public Integer getNumeroConta() {
            return numeroConta;
        }

        public int getAgencia() {
            return agencia;
        }

        @Override
        public Double sacar(Double valor) {
            this.saldo -= valor;
            System.out.println("O valor sacado foi de: R$" + valor);
            System.out.print("O valor restante é de: R$");
            return this.saldo;
        }

        @Override
        public Double depositar(Double valor) {
            this.saldo += valor;
            System.out.println("O valor depositado foi de: R$" + valor);
            System.out.print("O valor é de: R$");
            return this.saldo;
        }

        @Override
        public Double pix(Double valor, Conta contaPix) {
            this.saldo -= valor;
            contaPix.setSaldo(valor);
            System.out.println("O pix foi enviado");
            System.out.print("O saldo restante é de: R$");
            return this.saldo;
        }


        protected void imprimirExtrato() {
            System.out.println("=====Dados Conta=====");
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());
            System.out.println(getAgencia());
            System.out.println(getNumeroConta());
            System.out.println(getSaldo());
        }
}

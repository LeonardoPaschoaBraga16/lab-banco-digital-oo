
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Leonardo", "123.456.789-10");
        Cliente cliente2 = new Cliente("Daniel", "098.765.432-21");
        Conta cc = new ContaCorrente(1512334, cliente);
        Conta contaPoupanca = new ContaPoupanca(1234125, cliente2);

        cc.setSaldo(1500.00);
        System.out.println(cc.sacar(400.00));
        System.out.println(cc.pix(100.90, contaPoupanca));
        contaPoupanca.Extrato();
    }
}
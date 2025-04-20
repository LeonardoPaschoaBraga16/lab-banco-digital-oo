public interface InterfaceConta {

    public Double sacar(Double valor);
    public Double depositar(Double valor);
    public Double pix(Double valor, Conta contaPix);
    public void Extrato();
}

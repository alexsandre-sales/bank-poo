public class Main {
  public static void main(String[] args) {

    Cliente cliente = new Cliente();
    cliente.setNome("Fulano");

    Conta cc = new ContaCorrente(cliente);
    Conta cp = new ContaPoupanca(cliente);

    cc.depositar(5000);
    cc.sacar(5000);
    cc.transferir(1000, cp);

    cc.imprimir();
    cp.imprimir();

  }
}

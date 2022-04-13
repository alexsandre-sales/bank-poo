public class ContaPoupanca extends Conta{

  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimir() {
    System.out.println("*-*-*- Extrato Poupança-*-*-*");
    super.imprimirAtributos();
  }

}

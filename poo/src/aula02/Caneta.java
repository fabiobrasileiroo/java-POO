package aula02;

public class Caneta {
  public String modelo;
  public String cor;
  private float _ponta;
  protected int carga;
  protected boolean tampada;

  void status() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Uma caneta: " + this.cor);
    System.out.println("Ponta: " + this._ponta);
    System.out.println("Carga: " + this.carga);
    System.out.println("Esta tampada?" + this.tampada);
  }

  public void rabiscar() {
    if (this.tampada == true) {
      System.out.println("Erro!,Não posso rabiscar");
    } else {
      System.out.println("Estou Rabiscando");
    }
  }

  protected void tampar() {
    this.tampada = true;
  }

  protected void destampar() {
    this.tampada = false;
  }
}

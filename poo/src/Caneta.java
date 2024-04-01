public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    void status() {
        System.out.print("Uma caneta" + this.cor);
        System.out.print("\nEstar tampada "+this.tampada);
    }

    void rabiscar() {
        // Code for rabiscar functionality
    }

    void tamparSwitch() {
    }
}

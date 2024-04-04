// public class App {
//     public static void main(String[] args) throws Exception {
//         // Caneta c1 = new Caneta("Bic", "Azul", 0.7f, 100, true); // Example usage
//         // // System.out.println(c1);
//         // c1.tamparToggle();
//         // c1.tamparToggle();
//         // c1.rabiscar();
//         // c1.status();

//         Caneta c2 = new Caneta();
//         c2.modelo = "Fabinho123";
//         c2.cor = "Preta";
//         c2.tamparToggle();
//         c2.status();
//     }
// }

// class Caneta {
//     public String modelo;
//     public String cor;
//     public float ponta;
//     public int carga;
//     public boolean tampada;

//     // public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
//     //     this.modelo = modelo;
//     //     this.cor = cor;
//     //     this.ponta = ponta;
//     //     this.carga = carga;
//     //     this.tampada = tampada;
//     // }

//     int status() {
//         System.out.println("Uma caneta " + this.cor);
//         System.out.println("Estar tampada " + this.tampada);
//         System.out.println("Cor da caneta "+ this.cor);
//         System.out.println("Carga da caneta " + this.carga);
//         // System.out.println("Tampa da centa estar" + this.tampada);
//         return 0;
//     }

//     int rabiscar() {
//         if(this.tampada == false) {
//             System.out.println("Posso rabiscar");
//         } else {
//             System.out.println("Destampe para rabiscar");
//         } 
//         return 0;
//     }

//     boolean tamparToggle() {
//         return this.tampada = !this.tampada;
//     }
// }
import aula02.Caneta;
public class App {
    public static void main(String[] args) throws Exception {
        // Caneta c1 = new Caneta("Bic", "Azul", 0.7f, 100, true); // Example usage
        // // System.out.println(c1);
        // c1.tamparToggle();
        // c1.tamparToggle();
        // c1.rabiscar();
        // c1.status();
        Caneta caneta = new Caneta();
    }
}
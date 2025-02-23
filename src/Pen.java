public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void estado () {
        System.out.println("uma caneta"+ this.cor);
        System.out.println("Está tampada" + this.tampada);
        System.out.println("Ponta é:" + this.ponta) ;
        System.out.println("A carga é" + this.carga);
        System.out.println("Está tampada?" + this.tampada);

    }

    void rabiscar () {

        if (this.tampada == true) {
            System.out.println("Erro!Não é possivel rabiscar com a caneta tampada");
        } else
            System.out.println("Rabiscando");
        }
    }
    void tampar () {


    }
    void destampar () {

    }

public void main() {
}
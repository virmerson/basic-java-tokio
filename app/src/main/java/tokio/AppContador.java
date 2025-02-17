package tokio;

class Contador {
    static int contadorGlobal = 0;

    void incrementar() {
        contadorGlobal++;
    }

}
public class AppContador {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        contador1.incrementar();
       
        Contador contador2 = new Contador();
        contador2.incrementar();

        System.out.println(Contador.contadorGlobal);
    }
}



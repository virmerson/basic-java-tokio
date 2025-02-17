
package tokio;

class Animal {
    void fazerSom() {
        System.out.println("Som de animal");
    }
}

class Cao extends Animal {
    void fazerSom() {
        System.out.println("Au Au");
    }
}


class Gato extends Animal {
    void fazerSom() {
        System.out.println("Miau Miau");
    }
}

public class App {
   
    public static void main(String[] args) {
        Animal animal =  new Animal();
        animal.fazerSom();

        Cao cao = new Cao();
        cao.fazerSom();

        Gato gato = new Gato();
        gato.fazerSom();

        Animal meuPet = new Cao();
        meuPet.fazerSom();  
    }
}

public class Gato extends Animal implements Correr {


    @Override
    public void som() {
        System.out.println("Miau Miau");
    }

    @Override
    public void corrida() {
        System.out.println("Correndo");
    }
}
